import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Sherlock {
	static int i;
	static JFrame myFrame;
	static JPanel upPanel;
	static JPanel midPanel;
	static JPanel downPanel;
	static JTextArea textBox;
	static String[] fnames = {"milk.jpg","hair.jpg", "footprint.jpg", "hole.jpg", "fox.jpg"};
	static ImageIcon img;
	static JLabel label;
	
	static boolean aPress;
	static boolean bPress;
	static boolean cPress;
	
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~ */
	public static void play(){
		boolean correct = false;
		textBox.setText("Investigate for clues and guess who did it.");
		/* Your code goes in here */
		
		//Wrap this in a while loop to continue UNTIL the user guesses correctly
		printClue();
		correct = guess(); //correct will be true if they guessed right
		
	}
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
	public static void printClue(){
		img = new ImageIcon(fnames[i]);
		label.setIcon(img);
		i++;
		if(i >= 5){
			i = 0;
		}
		
	}
	
	public static boolean guess(){
		while(!aPress && !bPress && !cPress){
			System.out.println("");
		}
		if(aPress){
			aPress = false;
			textBox.setText("Correct!");
			return true;
		}
		else if(bPress){
			bPress = false;
			textBox.setText("Incorrect!  Here's another clue.");
			return false;
		}
		else if(cPress){
			cPress = false;
			textBox.setText("Incorrect!  Here's another clue.");
			return false;
		}
		return false;
	}

	public static void main(String[] args) {
		i = 0;
		myFrame = new JFrame();
		upPanel = new JPanel();
		midPanel = new JPanel();
		downPanel = new JPanel();		
		textBox = new JTextArea();
		
		myFrame.setSize(600,  310);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.add(upPanel, BorderLayout.NORTH);
		midPanel.add(textBox);
		myFrame.add(midPanel,  BorderLayout.CENTER);
		myFrame.add(downPanel, BorderLayout.SOUTH);
		
		img = new ImageIcon(fnames[i]);
		JLabel label0 = new JLabel("CLUE:");
		label = new JLabel(img);
		upPanel.add(label0);
		upPanel.add(label);
		
		JButton aButton = new JButton("Fox");
		aButton.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e)
	            {
				 	aPress = true;
	            }
		});

		
		JButton bButton = new JButton("Cat");
		bButton.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e)
	            {
				 	bPress = true;
	            }
		});
		
		JButton cButton = new JButton("Dog");
		cButton.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e)
	            {
				 	cPress = true;
	            }
		});
		
		downPanel.add(aButton);
		downPanel.add(bButton);
		downPanel.add(cButton);
		
		
		
		play();
			

	}

}
