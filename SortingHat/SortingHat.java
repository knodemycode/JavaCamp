import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class SortingHat {
	static String aText = "First Text";
	static String bText = "Second Text";
	
	static JFrame myFrame;
	static JPanel upPanel;
	static JTextArea textBox;
	static JPanel centerPanel;
	static JPanel downPanel;
	
	static boolean aPress;
	static boolean bPress;
	
	public static void question3(int c){
		/* Add your code here */
		//c can be 1, 2, 3, or 4
		//you can print out "Slytherin" , "Gryffindor", "Ravenclaw", or "Hufflepuff"

	}

	public static void main(String[] args) {
		myFrame = new JFrame();
		upPanel = new JPanel();
		downPanel = new JPanel();
		textBox = new JTextArea();
		centerPanel = new JPanel();
		aPress = false;
		bPress = false;
		
		ImageIcon hat = new ImageIcon("Hat.jpg");
		JLabel hatLabel = new JLabel(hat);
		
		JButton aButton = new JButton("Option A");
		aButton.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e)
	            {
				 	aPress = true;
	            }
		});

		
		JButton bButton = new JButton("Option B");
		bButton.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e)
	            {
				 	bPress = true;
	            }
		});
		
		myFrame.setSize(600,  300);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		upPanel.add(hatLabel);
		centerPanel.add(aButton);
		centerPanel.add(bButton);
		downPanel.add(textBox);
		myFrame.add(centerPanel, BorderLayout.CENTER);
		myFrame.add(upPanel, BorderLayout.NORTH);
		myFrame.add(downPanel,  BorderLayout.SOUTH);
		
		question1();
	}
	
	public static void question1(){
		textBox.setText("Are you brave? (a) Yes  (b) No");
		while(!aPress && !bPress){
			System.out.println("");
		}
		if(aPress){
			aPress = false;
			question2a();	
		}
		else if(bPress){
			bPress = false;
			question2b();
			
		}
	}
	
	public static void question2a(){
		textBox.setText("Are you cunning? (a) Yes  (b) No");
		while(!aPress && !bPress){
			System.out.println("");
		}
		if(aPress){
			aPress = false;
			question3(1);	
		}
		else if(bPress){
			bPress = false;
			question3(2);
			
		}
	}
	
	public static void question2b(){
		textBox.setText("Are you smart? (a) Yes  (b) No");
		while(!aPress && !bPress){
			System.out.println("");
		}
		if(aPress){
			aPress = false;
			question3(3);	
		}
		else if(bPress){
			bPress = false;
			question3(4);
			
		}
	}

}
