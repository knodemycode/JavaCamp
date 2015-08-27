// Knodemy
// Ayaz Latif
//
// Makes chicken face runs around the track.

import java.awt.*;

public class Chicken extends Racer {
	public static final int CHICKEN_SIZE = 60; // changes size of chicken
	
	// Constructs chicken object
	// ** Add this constructor for animation on racetrack
	public Chicken(RaceTrack r) {
		super(r);
	}
	
	// Overrides drawShape in Racer resulting in a chicken running around track
	public void drawShape(RaceTrack r, int xPos, int yPos) {
		Graphics g = r.getGraphics();
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