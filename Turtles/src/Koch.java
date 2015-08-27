// Knodemy

public class Koch {
	
	// Creates koch pattern
	public static void koch(int n, double step, Turtle turtle) {
		if(n==0) {
			turtle.goForward(step);
			return;
		}
		koch(n-1, step, turtle);
		turtle.turnLeft(60.0);
		koch(n-1, step, turtle);
		turtle.turnLeft(-120.0);
		koch(n-1, step, turtle);
		turtle.turnLeft(60.0);
		koch(n-1, step, turtle);
	}
	
	public static void main(String[] args) {
		int n = 5; // Change this number and see what happens
		double step = 1.0 / Math.pow(3.0, n);
		Turtle turtle = new Turtle(0, 0, 0);
		koch(n, step, turtle);
	}
}
