package week_05;

public class Point2D {
	private double x;
	private double y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public Point2D(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double distance() {
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}
}
