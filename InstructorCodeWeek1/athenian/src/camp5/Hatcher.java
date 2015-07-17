package camp5;


import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Hatcher {
	private String path;
	public static Image chicken;
	public static Image egg;
	private static int width = 900, height = 600;
	private static Dimension d = new Dimension(width, height);
	Random random = new Random();

	public static void student(Graphics g) {

		// wrap drawChicken in a for loop to create multiple chickens on the frame
		for(int i = 0; i < 10; i++){
		drawChicken(g);
		}

	}

	public static void main(String[] args) {
		Hatcher base = new Hatcher();
		base.setPath("chicken1.jpg");
		Hatcher.getChicken("chicken.jpg");
		Hatcher.setFrame();
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public static void getChicken(String path) {
		try {
			chicken = ImageIO.read(Hatcher.class.getResource(path));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void getEgg(String path) {

		try {
			egg = ImageIO.read(Hatcher.class.getResource(path));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static JFrame setFrame() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setPreferredSize(d);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(new paintChickens());
		return frame;

	}

	public static void drawChicken(Graphics g) {

		int xpos = new Random().nextInt(900), ypos = new Random().nextInt(600);
		g.drawImage(Hatcher.chicken, xpos, ypos, 100, 100, null);

	}

}

@SuppressWarnings("serial")
class paintChickens extends JPanel {
	public void paint(Graphics g) {
		super.paintComponent(g);
		setLayout(new GridLayout(10, 10, 10, 10));

		g.setFont(new Font("TimesRoman", 30, 30));

		Hatcher.student(g);

		// g.drawImage(Base.chicken,130,130,null);

		// Base.drawChicken(g);
	}
}
