// Knodemy
// Ayaz Latif
//
// Example of custom car. Notice extends Car instead of Racer

import java.awt.*;

public class CustomCarSample extends Car {
	
	// Constructs customCarSample object
	// ** Add this constructor for animation on racetrack
	public CustomCarSample(RaceTrack r) {
		super(r);
	} 
	
	// Overrides getColor() in Car
	public Color getColor() {
		return Color.RED;
	}
	
	// Overrides getWheels() in Car
	public int getWheels() {
		return 4;
	}	
}