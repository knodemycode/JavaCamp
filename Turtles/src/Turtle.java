// Knodemy

// This program is designed to introduce students to the concept of Objects.
public class Turtle {
	private double x, y;
	private double angle;
	
	// Creates Turtle object at (x0, y0) facing a0 degrees counterclockwise from x-axis
	public Turtle(double x0, double y0, double a0) {
		this.x = x0;
		this.y = y0;
		this.angle = a0;
	}
	
	// Rotates turtle delta degrees counterclockwise
	public void turnLeft(double delta) {
		angle += delta;
	}
	
	// Moves turtle forward step distance
	public void goForward(double step) {
		double oldX = x;
		double oldY = y;
		x += step * Math.cos(Math.toRadians(angle));
		y += step * Math.sin(Math.toRadians(angle));
		StdDraw.line(oldX, oldY, x, y);
	}
	
	// Returns angle (double)
	public double getAngle() {
		return angle;
	}
	
	// Sets angle of turtle (double)
	public void setAngle(double angle) {
		this.angle = angle;
	}
	
	public static void main(String[] args) {
		int N = 3; // Change this number and see what happens
		double angle = 360.0 / N;
		double step = Math.sin(Math.toRadians(angle/2));
		Turtle turtle = new Turtle(.5, 0, angle/2);
		for (int i = 0; i < N; i++) {
			turtle.goForward(step);
			turtle.turnLeft(angle);
		}
	}
}