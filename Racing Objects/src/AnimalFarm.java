// Knodemy
// Ayaz Latif
//
// Creates an animal farm track for racers to race on.

import java.awt.*;

public class AnimalFarm extends RaceTrack {
	
	// Overrides the getRoadColor() in RaceTrack
	public Color getRoadColor() {
		return new Color(139,69,19); // This is RGB scale for brown.
		// Google for other RGB (red, green, blue) custom colors
	}
	
	// Overrides toString() in RaceTrack
	public String toString() {
		return "Animal Farm!";
	}
}