
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class StarGiver {

	public static ImageIcon starPicker(int starNum){
		ImageIcon star;
		if (0 == starNum){
			star = new ImageIcon("bluestar.png");
		}
		else if (1 == starNum){
			star = new ImageIcon("greenstar.png");
		}
		else if (2 == starNum){
			star = new ImageIcon("silverstar.png");
		}
		else if(3 == starNum){
			star = new ImageIcon("goldstar.png");
		}
		else{
			star = new ImageIcon("whitestar.png");
		}
		return star;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		
		// Ask the user what their age is (output)
		// Collect the value of their age (input)
		
		
		/* Add a set of conditionals here
		 * to call the starPicker with different number values
		 * if the age is less than 15, number is 0
		 * if the age is less than 30, number is 1
		 * if the age is less than 45, number is 2
		 * if the age is less than 60, number is 3
		 * else, number is 4
		 */
		
		ImageIcon star = starPicker(4);
		
		// end conditionals
		
		
		
		JLabel label = new JLabel(star);
		
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.pack();
		frame.setVisible(true);
		
		
	}

}
