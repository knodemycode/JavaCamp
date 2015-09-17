import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame {
	/* All storage and final integers */
	JFrame frame;
	JButton addCounter;
	ArrayList<JLabel> numberList;
	ArrayList<JPanel> panelList;
	ArrayList<Counter> counterList;
	ArrayList<JButton> add;
	ArrayList<JButton> minus;
	ArrayList<JButton> delete;
	private static final int bigX = 75;
	private static final int bigY = 40;
	private static final int smallX = 50;
	private static final int smallY = 40;
	private static final int deleteX = 15;
	private static final int deleteY = 15;
	
	/* Creates the class and sets all variables and the addCoutner button */
	public MainFrame() {
		counterList = new ArrayList<Counter>(4);
		frame = new JFrame("Counter");
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		add = new ArrayList<JButton>(4); 
		minus = new ArrayList<JButton>(4); 
		delete = new ArrayList<JButton>(4); 
		addCounter = new JButton("Add a Counter");
		numberList = new ArrayList<JLabel>(4);
		panelList = new ArrayList<JPanel>(4);
		addCounter();
		addCounter.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				addCounter();
				draw();
			}
		});
	}
	
	/*main*/
	public static void main(String args[]){
		MainFrame lol = new MainFrame();
		lol.draw();
	}
	/*deletes a counter from frame and all corresponding components */
	public void deleteCounter(int counterID){
		frame.remove(panelList.get(counterID));
		panelList.remove(counterID);
		counterList.remove(counterID);
		numberList.remove(counterID);
		delete.remove(counterID);
		add.remove(counterID);
		minus.remove(counterID);
	}
	/*adds counter and corresponding components*/
	public void addCounter(){
		if(counterList.size()<4){
			counterList.add(new Counter());
			numberList.add(new JLabel());
			panelList.add(new JPanel());
			int iHateThis = counterList.size()-1;
			delete.add(new JButton("x"));
			delete.get(iHateThis).addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					JButton buttonSource = (JButton) e.getSource();
					int index = delete.indexOf(buttonSource);
					deleteCounter(index);
					draw();
				}
			});
			add.add(new JButton("+"));
			add.get(iHateThis).addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{	
					JButton buttonSource = (JButton) e.getSource();
					int index = add.indexOf(buttonSource);
					counterList.get(index).countUp(1);
					updateLabels();
					
				}
			});
			minus.add(new JButton("-"));
			minus.get(iHateThis).addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					JButton buttonSource = (JButton) e.getSource();
					int index = minus.indexOf(buttonSource);
					if(counterList.get(index).count>0){
						counterList.get(index).countUp(-1);
						updateLabels();
					}
				}
			});
		}
	}
	/*updates the numbers of counters in graphics*/
	public void updateLabels(){
			for(int i = 0; i<counterList.size(); i++){
				numberList.get(i).setText(Integer.toString(counterList.get(i).count));
				Font labelFont = numberList.get(i).getFont();
				String labelText = numberList.get(i).getText();
				int stringWidth = numberList.get(i).getFontMetrics(labelFont).stringWidth(labelText);
				int componentWidth = numberList.get(i).getWidth();
				// Find out how much the font can grow in width.
				double widthRatio = (double)componentWidth / (double)stringWidth;
				int newFontSize = (int)(labelFont.getSize() * widthRatio);
				int componentHeight = numberList.get(i).getHeight();
				// Pick a new font size so it will not be larger than the height of label.
				int fontSizeToUse = Math.min(newFontSize, componentHeight);
				// Set the label's font size to the newly determined size.
				numberList.get(i).setFont(new Font(labelFont.getName(), Font.PLAIN, fontSizeToUse));
			}
			frame.getContentPane().repaint();
	}
	/*	Draws frame
	 *  Also works as redraw function
	 */
	public void draw(){
		for(int i=0; i<panelList.size(); i++){
			panelList.get(i).remove(delete.get(i));
		}
		frame.setLayout(null);
		frame.add(panelList.get(0));
		if(counterList.size() == 1){
			panelList.get(0).setLayout(null);
			panelList.get(0).setSize(600,600);
			panelList.get(0).setLocation(0, 0);
			panelList.get(0).add(add.get(0));
			add.get(0).setBounds(100, 450, bigX, bigY);
			panelList.get(0).add(minus.get(0));
			minus.get(0).setBounds(425, 450, bigX, bigY);
			panelList.get(0).add(addCounter);
			addCounter.setBounds(225, 450, 150, 50);
			panelList.get(0).add(numberList.get(0));
			numberList.get(0).setBounds(225, 200, 150, 200);
			panelList.get(0).setBackground(new Color(0xEEEEEE));
		}
		else if(counterList.size() == 2){
			frame.setLayout(null);
			//panel1
			panelList.get(0).setLayout(null);
			panelList.get(0).setSize(600,300);
			panelList.get(0).setBounds(0, 0, 600, 300);
			panelList.get(0).add(add.get(0));
			add.get(0).setBounds(100, 200, bigX, bigY);
			panelList.get(0).add(minus.get(0));
			minus.get(0).setBounds(425, 200, bigX, bigY);
			numberList.get(0).setBounds(225, 50, 100, 150);
			panelList.get(0).add(delete.get(0));
			delete.get(0).setBounds(560, 25, deleteX, deleteY);
			panelList.get(0).setBackground(new Color(0xEEEEEE));
			//panel2
			frame.add(panelList.get(1));
			panelList.get(1).setLayout(null);
			panelList.get(1).setBackground(new Color(0xFFFFFF));
			panelList.get(1).setSize(600,300);
			panelList.get(1).setBounds(0, 300, 600, 300);
			panelList.get(1).add(add.get(1));
			add.get(1).setBounds(100, 200, bigX, bigY);
			panelList.get(1).add(minus.get(1));
			minus.get(1).setBounds(425, 200, bigX, bigY);
			panelList.get(1).add(addCounter);
			addCounter.setBounds(225, 200, 150, 50);
			panelList.get(1).add(numberList.get(1));
			numberList.get(1).setBounds(225, 50, 100, 150);
			panelList.get(1).add(delete.get(1));
			delete.get(1).setBounds(560, 25, deleteX, deleteY);
		}
		else if(counterList.size() == 3){
			try {
				panelList.get(1).remove(addCounter);
			} catch(NullPointerException e){
				
			}
			frame.setLayout(null);
			//panel1
			panelList.get(0).setLayout(null);
			panelList.get(0).setSize(300,300);
			panelList.get(0).setBounds(0, 0, 300, 300);
			panelList.get(0).add(add.get(0));
			add.get(0).setBounds(50, 230, smallX, smallY);
			panelList.get(0).add(minus.get(0));
			minus.get(0).setBounds(200, 230, smallX, smallY);
			panelList.get(0).add(numberList.get(0));
			numberList.get(0).setBounds(100, 50, 100, 150);
			panelList.get(0).add(delete.get(0));
			delete.get(0).setBounds(260, 25, deleteX, deleteY);
			panelList.get(0).setBackground(new Color(0xEEEEEE));
			//panel2
			frame.add(panelList.get(1));
			panelList.get(1).setLayout(null);
			panelList.get(1).setSize(300,300);
			panelList.get(1).setBounds(300, 0, 300, 300);
			panelList.get(1).setBackground(new Color(0xFFFFFF));
			panelList.get(1).add(add.get(1));
			add.get(1).setBounds(50, 230, smallX, smallY);
			panelList.get(1).add(minus.get(1));
			minus.get(1).setBounds(200, 230, smallX, smallY);
			panelList.get(1).add(numberList.get(1));
			numberList.get(1).setBounds(100, 50, 100, 150);
			panelList.get(1).add(delete.get(1));
			delete.get(1).setBounds(260, 25, deleteX, deleteY);
			//panel3
			frame.add(panelList.get(2));
			panelList.get(2).setLayout(null);
			panelList.get(2).setBackground(new Color(0xDDDDDD));
			panelList.get(2).setSize(600,300);
			panelList.get(2).setBounds(0, 300, 600, 300);
			panelList.get(2).add(add.get(2));
			add.get(2).setBounds(100, 200, bigX, bigY);
			panelList.get(2).add(minus.get(2));
			minus.get(2).setBounds(425, 200, bigX, bigY);
			panelList.get(2).add(numberList.get(2));
			numberList.get(2).setBounds(225, 50, 100, 150);
			panelList.get(2).add(delete.get(2));
			delete.get(2).setBounds(560, 25, deleteX, deleteY);
			//counter
			panelList.get(2).add(addCounter);
			addCounter.setBounds(225, 200, 150, 50);
		}
		else if(counterList.size() == 4){
			panelList.get(2).remove(addCounter);
			frame.setLayout(null);
			//panel1
			panelList.get(0).setLayout(null);
			panelList.get(0).setSize(300,300);
			panelList.get(0).setBounds(0, 0, 300, 300);
			panelList.get(0).add(add.get(0));
			add.get(0).setBounds(50, 230, smallX, smallY);
			panelList.get(0).add(minus.get(0));
			minus.get(0).setBounds(200, 230, smallX, smallY);
			panelList.get(0).add(numberList.get(0));
			numberList.get(0).setBounds(100, 50, 100, 150);
			panelList.get(0).add(delete.get(0));
			delete.get(0).setBounds(260, 25, deleteX, deleteY);
			panelList.get(0).setBackground(new Color(0xEEEEEE));
			//panel2
			frame.add(panelList.get(1));
			panelList.get(1).setLayout(null);
			panelList.get(1).setSize(300,300);
			panelList.get(1).setBounds(300, 0, 300, 300);
			panelList.get(1).setBackground(new Color(0xFFFFFF));
			panelList.get(1).add(add.get(1));
			add.get(1).setBounds(50, 230, smallX, smallY);
			panelList.get(1).add(minus.get(1));
			minus.get(1).setBounds(200, 230, smallX, smallY);
			panelList.get(1).add(numberList.get(1));
			numberList.get(1).setBounds(100, 50, 100, 150);
			panelList.get(1).add(delete.get(1));
			delete.get(1).setBounds(260, 25, deleteX, deleteY);
			//panel3
			frame.add(panelList.get(2));
			panelList.get(2).setLayout(null);
			panelList.get(2).setSize(300,300);
			panelList.get(2).setBounds(0, 300, 300, 300);
			panelList.get(2).setBackground(new Color(0xFFFFFF));
			panelList.get(2).add(add.get(2));
			add.get(2).setBounds(50, 230, smallX, smallY);
			panelList.get(2).add(minus.get(2));
			minus.get(2).setBounds(200, 230, smallX, smallY);
			panelList.get(2).add(numberList.get(2));
			numberList.get(2).setBounds(100, 50, 100, 150);
			panelList.get(2).add(delete.get(2));
			delete.get(2).setBounds(260, 25, deleteX, deleteY);
			//panel4
			frame.add(panelList.get(3));
			panelList.get(3).setLayout(null);
			panelList.get(3).setSize(300,300);
			panelList.get(3).setBounds(300, 300, 300, 300);
			panelList.get(3).setBackground(new Color(0xEEEEEE));
			panelList.get(3).add(add.get(3));
			add.get(3).setBounds(50, 230, smallX, smallY);
			panelList.get(3).add(minus.get(3));
			minus.get(3).setBounds(200, 230, smallX, smallY);
			panelList.get(3).add(numberList.get(3));
			numberList.get(3).setBounds(100, 50, 100, 150);
			panelList.get(3).add(delete.get(3));
			delete.get(3).setBounds(260, 25, deleteX, deleteY);
		}
		frame.setVisible(true);
		frame.repaint();
	}
}
