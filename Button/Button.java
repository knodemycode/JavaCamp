import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Button{
	
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Button");
		myFrame.setSize(600,  600);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton myButton1 = new JButton("Click me!");
		myButton1.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e)
	            {
	                //This is what button 1 does
	                System.out.println("Button 1 works!");
	            }
		});
		
		JPanel myPanel1 = new JPanel();
		myPanel1.add(myButton1);
		myFrame.add(myPanel1, BorderLayout.NORTH);
		
		JButton myButton2 = new JButton("Click me2!");
		myButton2.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e)
	            {
				 	//This is what button 2 does
	                System.out.println("Button 2 works!");
	            }
		});
		JPanel myPanel2 = new JPanel();
		myPanel2.add(myButton2);
		myFrame.add(myPanel2, BorderLayout.CENTER);
		
		myFrame.setVisible(true);
		

	}

	


	 
	  
}