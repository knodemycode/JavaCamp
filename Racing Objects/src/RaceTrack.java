// Knodemy
// Ayaz Latif
//
// Creates a race track for racers to race on.

import java.awt.*;

public class RaceTrack {
	public static final int WIDTH = 1000;
	public static final int HEIGHT = 800;
	private DrawingPanel panel;
	private Graphics g;
	
	// Returns color of grass in middle of track
	public Color getGrassColor() {
		return Color.GREEN;
	}
	
	// Returns color of road
	public Color getRoadColor() {
		return Color.BLACK;
	}
	
	// Returns String displayed in center of track
	public String toString() {
		return "Knodemy's RaceTrack";
	}
	
	// Returns graphics that controls track
	public Graphics getGraphics() {
		return g;
	}
	
	// Constructs RaceTrack Object
	public RaceTrack() {
		panel = new DrawingPanel(WIDTH, HEIGHT);
		g = panel.getGraphics();
		panel.setBackground(Color.GRAY);
		redraw();
	}
	
	// Redraws track (used with animation)
	public void redraw() {
		panel.sleep(50);
		panel.clear();
		g.setColor(this.getRoadColor());
		g.fillRect(WIDTH / 20, HEIGHT / 20, 9 * WIDTH / 10, 9 * HEIGHT / 10);
		g.setColor(this.getGrassColor());
		g.fillRect(WIDTH / 20 + 100, HEIGHT / 20 + 100, 9 * WIDTH / 10 - 200, 9 * HEIGHT / 10 - 200);
		g.setColor(Color.RED);
		g.drawString(this.toString(),WIDTH / 2, HEIGHT / 2);
	}
}