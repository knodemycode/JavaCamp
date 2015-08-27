// Knodemy
// Ayaz Latif
//
// Override the following methods to change features of your car
//		getColor()
//		getSpeed()
//
// Makes basic racer run around track.

import java.awt.*;

public class Racer {
	
	// Default constructor. Note this fails to construct racer object.
	public Racer() {
		System.out.println("I don't know where to draw the racer");
	}
	
	// Constructs racer object
	public Racer(RaceTrack r) {
		int x0 = RaceTrack.WIDTH / 20;
		int y0 = RaceTrack.HEIGHT / 20;
		int xMax = 9 * RaceTrack.WIDTH / 10;
		int yMax = y0 + 9 * RaceTrack.HEIGHT / 10 - 100;
		for(int i = 0; i * this.getSpeed() < xMax; i++) { // move top side right >
			r.redraw();
			drawShape(r, x0 + (i * this.getSpeed()), y0);
		}
		
		for(int i = 0; i * this.getSpeed() < yMax; i++) { // move right side down \/
			r.redraw();
			drawShape(r, xMax, y0 + (i * this.getSpeed()));
		}
		
		for(int i = 0; i * this.getSpeed() < xMax; i++) { // move bottom side left <
			r.redraw();
			drawShape(r, xMax - (i * this.getSpeed()), yMax);
		}
		
		for(int i = 0; i * this.getSpeed() < yMax; i++) { // move left side up ^
			r.redraw();
			drawShape(r, x0, yMax - (i * this.getSpeed()));
		}	
	}
	
	// Draws shape on raceTrack at specified x and y position
	public void drawShape(RaceTrack r, int x, int y) {
		Graphics g = r.getGraphics();
		g.setColor(this.getColor());
		g.fillRect(x, y, 50, 50);
	}
	
	// Returns color of the body of racer
	public Color getColor() {
		return Color.WHITE;
	}
	
	// Returns speed of racer
	public int getSpeed() {
		return 50;
	}
}