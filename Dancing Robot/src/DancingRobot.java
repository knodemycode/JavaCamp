// Knodemy
// Ayaz Latif

import java.awt.*;

// This program is designed to introduce students to methods, parameters, and loops. 
// Students will create a robot by calling several methods to build different parts of the
// robot. They can also create a dancing robot using a loop. Students can
// save animated gifs of dancing robot if they choose to.

public class DancingRobot {
	
	public static final int WIDTH = 900; // width of panel
	public static final int HEIGHT = 600; // height of panel
	
	public static void main(String[]args) {
		DrawingPanel panel = new DrawingPanel(WIDTH, HEIGHT);
		Graphics g = panel.getGraphics();
		
		/** Build a static robot. First show basic. Then explain how you can
		 * move robot with extra parameters
		drawHead(g); --> drawHead(g, x, y);
		**/
		
		/**
		 * Build a dancing robot. Build a loop. Explain slope concept
		 * for(initial slope; test for slope; update slope) {
		 * 	dance(g, panel, slope);
		 * }
		 */
	}
	
	// Draws head of robot in default location (location corresponds to top left of figure)
	public static void drawHead(Graphics g) {
		drawHead(g, 125, 50);
	}
	
	// Draws body of robot in default location (location corresponds to top left of figure)
	public static void drawBody(Graphics g) {
		drawBody(g, 100, 100);
	}
	
	// Draws right arm of robot in default location (location corresponds to top left of figure)
	public static void drawRightArm(Graphics g) {
		drawRightArm(g, 300, 100);
	}
	
	// Draws left arm of robot in default location (location corresponds to top left of figure)
	public static void drawLeftArm(Graphics g) {
		drawLeftArm(g, 50, 100);
	}
	
	// Draws right leg of robot in default location (location corresponds to top left of figure)
	public static void drawRightLeg(Graphics g) {
		drawLeg(g, 230, 200);
	}
	
	// Draws left leg of robot in default location (location corresponds to top left of figure)
	public static void drawLeftLeg(Graphics g) {
		drawLeg(g, 100, 200);	
	}
	
	// Draws head of robot in given location (x, y) corresponding to top left of figure
	public static void drawHead(Graphics g, int x, int y) {
		g.setColor(Color.LIGHT_GRAY); //head
		g.fillRect(x, y, 150, 50);
		g.setColor(Color.WHITE); // mouth
		g.fillRect(x + 35, y + 30, 80, 10);
		g.setColor(Color.BLACK);
		for(int i = 0; i < 8; i++) {
			g.drawRect((x + 35) + (i * 10), (y + 30), 10, 10);
		}
		g.drawRect(x, y, 150, 50);
		g.setColor(Color.RED); // eyes
		g.fillRect(x + 30, y + 10, 40, 10);
		g.fillRect(x + 80, y + 10, 40, 10);
		
	}
	
	// Draws body of robot in given location (x, y) corresponding to top left of figure
	public static void drawBody(Graphics g, int x, int y) {
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(x, y, 200, 100);
		g.setColor(Color.BLACK);
		g.drawRect(x, y, 200, 100);
	}
	
	// Draws right arm of robot in given location (x, y) corresponding to top left of figure
	public static void drawRightArm(Graphics g, int x, int y) {
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(x, y, 50, 50);
		g.setColor(Color.RED);
		g.fillRect(x + 50, y, 50, 50);
		g.setColor(Color.BLACK);
		g.drawRect(x, y, 50, 50);
		g.drawRect(x + 50, y, 50, 50);
	}
	
	// Draws left arm of robot in given location (x, y) corresponding to top left of figure
	public static void drawLeftArm(Graphics g, int x, int y) {
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(x, y, 50, 50);
		g.setColor(Color.RED);
		g.fillRect(x - 50, y, 50, 50);
		g.setColor(Color.BLACK);
		g.drawRect(x, y, 50, 50);
		g.drawRect(x - 50, y, 50, 50);
	}
	
	// Draws leg of robot in given location (x, y) corresponding to top left of figure
	public static void drawLeg(Graphics g, int x, int y) {
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(x, y, 70, 100);
		g.setColor(Color.BLACK);
		g.drawRect(x, y, 70, 100);
	}
	
	// Creates a dancing robot. You need to specify the slope of how fast the robot will move.
	public static void dance(Graphics g, DrawingPanel panel, int slope) {
		panel.sleep(40);
		panel.clear();
		drawHead(g, 125 + (3 * slope), 50);
		drawBody(g, 100 + (3 * slope), 100);
		
		g.drawLine(250 + (3 * slope), 200, 260 + (3 * slope), 320); // legs
		g.drawLine(140 + (3 * slope), 200 , 130 + (3 * slope), 320);
		if(slope % 60 < 30) { // alternates arms
			g.drawLine(300 + (3 * slope), 125, 400 + (3 * slope), 50 + 5 * (slope % 30));
			g.drawLine(100 + (3 * slope), 125, 0 + (3 * slope), 200 - 5 * (slope % 30));
		} else {
			g.drawLine(300 + (3 * slope), 125, 400 + (3 * slope), 200 - 5 * (slope % 30)); 
			g.drawLine(100 + (3 * slope), 125, 0 + (3 * slope), 50 + 5 * (slope % 30));
		}
	}
		
}
