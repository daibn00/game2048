package BTjava;

public class Triangle {
	Point A,B,C,O;

	public Triangle(Point a, Point b, Point c) throws Valueillegal {
		if(a.getX()==b.getX()||a.getX()==c.getX()) throw new Valueillegal("Value illegal");
		if(a.getY()==b.getY()||a.getY()==c.getY()) throw new Valueillegal("Value illegal");
	    A = a;
		B = b;
		C = c;
		O=new Point(0,0);
	}
	public void setO(){
		O.setX((B.getX()+C.getX())/2);
		O.setY((B.getY()+C.getY())/2);
		O.Homothety(A, 0.6666666);
	}
	public double Square() {
		double p=(A.Distance(B)+A.Distance(C)+C.Distance(B))/2;
		return Math.sqrt(p*(p-A.Distance(B)*(p-A.Distance(C)*C.Distance(B))));
	}
	public void Move(double deltax,double deltay) {
		A.Move(deltax, deltay);
		B.Move(deltax, deltay);
		C.Move(deltax, deltay);
	}
	public void Rotate(double alpha) {
		A.Rotate(O, alpha);
		B.Rotate(O, alpha);
		C.Rotate(O, alpha);
	}
	public void Zoom(double ratio) {
		A.Homothety(O, ratio);
		B.Homothety(O, ratio);
		C.Homothety(O, ratio);
	}
}
