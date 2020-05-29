package BTjava;

import org.omg.PortableInterceptor.DISCARDING;

public class Point {
	private static final String O = null;
	private double x,y;

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

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
	
	public double Distance(Point p) {
		return Math.sqrt(Math.pow(this.x-p.getX(), 2)+Math.pow(this.y-p.y,2 ));
	}
	public void Move(double deltax,double deltay) {
		x=x+deltax;
		y=y+deltay;
	}
	public void Homothety(Point I,double ratio) {
		x=I.getX()+ratio*(x-I.getX());
		y=I.getY()+ratio*(y-I.getY());
	}
	public void Rotate(Point O,double alpha) {
		double a=O.getX();
		double b=O.getY();
		x=(x-a)*Math.cos(alpha)-(y-b)*Math.sin(alpha)+a;
		y=(x-a)*Math.sin(alpha)+(y-b)*Math.cos(alpha)+b;
	}
	public static void main(String[] args) {
		Point a=new Point(2, 2);
		Point b=new Point(2, 4);
		System.out.println(a.Distance(b));
	}
}
