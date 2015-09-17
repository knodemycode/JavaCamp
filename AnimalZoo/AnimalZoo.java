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

		int i = 0;

		//this is what our zoo program will loop through
		Animal[] animalArray = new Animal[2];
		
		//write your code for an animal here

		ImageIcon cheetahPic = new ImageIcon("cheetah.jpg");
		JLabel cheetahLabel = new JLabel(cheetahPic);
		Animal cheetah = new Animal("cheetah", "A spotted animal that is fast" ,cheetahPic);
		Animal zebra = new Animal("zebra", "has stripes" ,cheetahPic);

		animalArray[0] = cheetah;
		animalArray[1] = zebra;

		//end section for animal code

		JButton aButton = new JButton("Next animal");
		aButton.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e)
	            {
				 	aPress = true;
	            }
		});
		
		myFrame.setSize(600,  300);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		upPanel.add(cheetahLabel);
		centerPanel.add(aButton);
		downPanel.add(textBox);
		myFrame.add(centerPanel, BorderLayout.CENTER);
		myFrame.add(upPanel, BorderLayout.NORTH);
		myFrame.add(downPanel,  BorderLayout.SOUTH);
		

		//displayAnimal();
		//code to display the animals

		textBox.setText(animalArray[i].getName() + " : " + animalArray[i].getDescription());
		while(!aPress){
			System.out.println("");
		}
		if(aPress){
			i++;
			textBox.setText(animalArray[i].getName() + " : " + animalArray[i].getDescription());
			aPress = false;
		}

	}
	
	//this method is deprecated and NEEDS to be removed
	public static void displayAnimal(){


		//textBox.setText(ani);
		while(!aPress && !bPress){
			System.out.println("");
		}
	}
}