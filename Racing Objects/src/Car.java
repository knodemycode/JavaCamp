// Knodemy
// Ayaz Latif
//
// Makes car drive around track.

import java.awt.*;

public class Car extends Racer {
	
	// Constructs car object
	// ** Add this constructor for animation on racetrack
	public Car(RaceTrack r) {
		super(r);
	}
	
	// overrides drawShape() in Racer to have a different object race around track
	public void drawShape(RaceTrack r, int x, int y) {
		Graphics g = r.getGraphics();
		int carLength = 100;
		g.setColor(this.getColor());
		g.fillRect(x + 25, y, carLength / 2, 50);
		g.fillRect(x, y + 25, carLength, 25);
		
		g.setColor(Color.WHITE);
		for(int i = 0; i < this.getWheels(); i++) { // wheels
			g.fillOval(x + (i * (carLength / this.getWheels())), y + 50, 20, 20);
		}
	}
	
	// Returns number of wheels on car
	public int getWheels() {
		return 2;
	}
}