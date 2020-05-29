package BTjava;

public class Circle {
	private Point o;
	private double r;
	
	@Override
	public String toString() {
		return "Circle [o=" + o + ", r=" + r + "]";
	}
	public Point getO() {
		return o;
	}

	public void setO(Point o) {
		this.o = o;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public Circle(Point o,double r) {
		this.o=o;
		this.r=r;
	}
	public double Square() {
		return Math.PI*r*r;
	}

	public void Move(double deltax,double deltay) {
		this.o.Move(deltax, deltay);
	}
	public void Zoom(double ratio) {
		this.setR(this.getR()*ratio);
	}
}
