import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class AnimalZoo{

	static String aText = "First Text";
	static String bText = "Second Text";
	
	static JFrame myFrame;
	static JPanel upPanel;
	static JTextArea textBox;
	static JPanel centerPanel;
	static JPanel downPanel;
	
	static boolean aPress;
	static boolean bPress;

	public static void main(String[] args) {
		myFrame = new JFrame();
		upPanel = new JPanel();
		downPanel = new JPanel();
		textBox = new JTextArea();
		centerPanel = new JPanel();
		aPress = false;
		bPress = false;
		
		makeAnimals();

		JButton aButton = new JButton("Option A");
		aButton.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e)
	            {
				 	aPress = true;
	            }
		});
		
		myFrame.setSize(600,  300);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		upPanel.add(hatLabel);
		centerPanel.add(aButton);
		downPanel.add(textBox);
		myFrame.add(centerPanel, BorderLayout.CENTER);
		myFrame.add(upPanel, BorderLayout.NORTH);
		myFrame.add(downPanel,  BorderLayout.SOUTH);
		

		displayAnimal();
	}
	
	public static void makeAnimals(){
		ImageIcon hat = new ImageIcon("cheetah.jpg");
		JLabel hatLabel = new JLabel(hat);
		Animal zebra = new Animal("Zebra", hat);

	}

	public static void displayAnimal(){
		textBox.setText("Are you brave? (a) Yes  (b) No");
		while(!aPress && !bPress){
			System.out.println("");
		}
	}
}