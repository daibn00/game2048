package B1;

public class DuongThang {
	private double a;
	private double b;

	public DuongThang() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DuongThang(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double distance() {

		return Math.abs(this.b / Math.sqrt(this.a * this.a + 1));

	}
	
	public boolean check(double x, double y) {
		double value  = this.a * x + this.b;
		if(Math.abs(value - y) < 0.00001) {
			return true;
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		return "DuongThang [a=" + a + ", b=" + b + "]";
	}
	

}
