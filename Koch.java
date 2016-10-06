
public class Koch {

	// plot Koch curve of order n, with given step size
	public static void koch(int n, double step, Turtle turtle) {
		if (n == 0) {
			turtle.goForward(step);
			return;
		}
		koch(n - 1, step, turtle);
		turtle.turnLeft(60.0);
		koch(n - 1, step, turtle);
		turtle.turnLeft(-120.0);
		koch(n - 1, step, turtle);
		turtle.turnLeft(60.0);
		koch(n - 1, step, turtle);

	}

	public static void main(String[] args) {
		int order = 7;
		double step = 1.0 / Math.pow(3, order);

		Turtle turtle = new Turtle(0.3, .7, 00.0);
		turtle.penDown();
		koch(order, step / 3, turtle);
		turtle.turnLeft(-120);
		koch(order, step / 3, turtle);
		turtle.turnLeft(-120);
		koch(order, step / 3, turtle);

	}
}