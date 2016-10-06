
public class KochModified {

	// plot Koch curve of order n, with given step size
	public static void kochModified(int n, double step, Turtle turtle) {
		if (n == 0) {
			turtle.goForward(step);
			return;
		}
		kochModified(n - 1, step, turtle);
		turtle.turnLeft(60.0);
		kochModified(n - 1, step, turtle);
		turtle.turnLeft(-120.0);
		kochModified(n - 1, step, turtle);
		turtle.turnLeft(60.0);
		kochModified(n - 1, step, turtle);

	}

	public static void kochSides(double step, int order, Turtle turtle) {
		StdOut.println(
				"How many sides do you want your koch snowflake to have? (only those which the half of the number is a factor of 360 and half your number is a whole number, i.e. 2, 4, 10, 6, but not 5 or 9 ");
		int s = StdIn.readInt();
		while( s % 2 != 0 || 360 % (s/2) != 0){
			StdOut.println("The half of the number you entered is not a factor of 360 or not an integer! Try again: ");
			s = StdIn.readInt();
			
		}
			double angle = -360 / (s / 2);
			for (int i = 0; i < s; i++) {
				kochModified(order, step / (s / 2), turtle);
				turtle.turnLeft(angle);

			

		}
	}

	public static void main(String[] args) {
		int order = 3;
		double step = 1.0 / Math.pow(3, order);

		Turtle turtle = new Turtle(0.3, .7, 00.0);
		turtle.penDown();
		kochSides(step, order, turtle);

	}
}