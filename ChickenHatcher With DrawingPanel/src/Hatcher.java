// Knodemy
// Ayaz Latif

import java.awt.*;
import java.util.*;

// This program is designed to help students understand the structure of loops.
// There is a fun little animation whenever a student draws a chicken.
// Note: You can scale the chicken, control animation speed, and change size of
// panel.

public class Hatcher {
	public static final int WIDTH = 900; // panel width
	public static final int HEIGHT = 600; // panel height
	public static final int DELAY = 50; // animation delay
	public static final int CHICKEN_SIZE = 20; // size of chicken
	
	public static void main(String[] args) {
		Map<Integer, Integer> positions = new HashMap<Integer, Integer>();
		DrawingPanel panel = new DrawingPanel(WIDTH, HEIGHT);
		Graphics g = panel.getGraphics();
		panel.setBackground(Color.CYAN);
		
		student(g, panel, positions);
	}
	
	// Workspace for student
	public static void student(Graphics g, DrawingPanel panel, Map<Integer, Integer> positions) {
		
	}
			
	// Lays eggs on panel. Remembers location of eggs.  
	public static void layEggs(Graphics g, DrawingPanel panel, Map<Integer, Integer> positions) {
		g.setColor(Color.BLACK);
		g.drawString("Laying eggs...", 10, 10);
		Random r = new Random();
		int xPos = r.nextInt(WIDTH - 100);
		int yPos = r.nextInt(HEIGHT - 100);
		positions.put(xPos, yPos);
		g.setColor(Color.YELLOW);
		g.fillOval(xPos, yPos, CHICKEN_SIZE / 2, CHICKEN_SIZE); // draws egg
		g.setColor(Color.BLACK);
		g.drawString("#" + positions.size(), xPos + ((CHICKEN_SIZE - 10) / 2) / 2, 
					 yPos + CHICKEN_SIZE / 2); // labels egg number
		panel.sleep(DELAY);
	}
	
	// Hatches ALL eggs on the panel. 
	public static void hatchEggs(Graphics g, DrawingPanel panel, Map<Integer, Integer> positions) {		
		panel.clear();
		g.setColor(Color.BLACK);
		g.drawString("Hatching eggs...", 10, 10);
		g.setColor(Color.YELLOW);
		for(Integer x : positions.keySet()) { // redraws all eggs in same locations
			g.fillOval(x, positions.get(x), CHICKEN_SIZE / 2, CHICKEN_SIZE);
		}
		
		for(Integer xPos : positions.keySet()) { // hatches eggs
			int yPos = positions.get(xPos);
			panel.sleep(DELAY);
			drawChickenFace(g, xPos, yPos);
		}
	}
	
	// Draws single chicken face figure.
	public static void drawChickenFace(Graphics g, int xPos, int yPos) {
		g.setColor(Color.WHITE);
		g.fillOval(xPos - ((CHICKEN_SIZE - 10) / 2) / 2, yPos, CHICKEN_SIZE, CHICKEN_SIZE); // face
		g.setColor(Color.BLACK);
		g.drawOval(xPos, yPos + (CHICKEN_SIZE / 6), CHICKEN_SIZE / 3, CHICKEN_SIZE / 3); // eyes
		g.drawOval(xPos + CHICKEN_SIZE / 3, yPos + CHICKEN_SIZE / 6, CHICKEN_SIZE / 3,
				   CHICKEN_SIZE / 3);
		g.fillOval(xPos + CHICKEN_SIZE / 12, yPos + CHICKEN_SIZE / 4, CHICKEN_SIZE / 12, 
				   CHICKEN_SIZE / 12);
		g.fillOval(xPos + CHICKEN_SIZE / 3 + 3, yPos + CHICKEN_SIZE / 3, CHICKEN_SIZE / 12, 
				   CHICKEN_SIZE / 12);
		g.setColor(Color.ORANGE);
		for(int i = 0; i < CHICKEN_SIZE / 3; i++) { // beak
			g.drawLine(xPos + (2 * i), yPos + CHICKEN_SIZE / 2, xPos + 2 + i,
					   yPos + (CHICKEN_SIZE / 2 + 5) + (i));
		}
	}
	
}
