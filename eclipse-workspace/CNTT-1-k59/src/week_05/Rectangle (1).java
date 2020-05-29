package BTjava; 	

public class Rectangle{
	private Point A,B,C,D,O;
	
	public Rectangle(Point A,Point B,Point C,Point D) throws Exception,Valueillegal {
		if(A.Distance(C)!=B.Distance(D)) throw new Valueillegal("Rectangle value illegal");
		if(A.equals(B)||A.equals(D)) throw new Valueillegal("Rectangle value illegal ");
		if((A.getX()-B.getX())*(D.getX()-C.getX())<0) throw new Valueillegal("Order illegal");
		if((A.getY()-B.getY())*(D.getY()-C.getY())<0) throw new Valueillegal("Order illegal");
		this.A=A;
		this.B=B;
		this.C=C;
		this.D=D;
		O=new Point(0,0);
		setO();
	}
	
	public double Square() {
		return this.A.Distance(this.B)*this.A.Distance(this.D);
	}
	
	public void Move(double deltax,double deltay) {
		A.Move(deltax, deltay);
		B.Move(deltax, deltay);
		C.Move(deltax, deltay);
		D.Move(deltax, deltay);
		setO();
	}
	public void setO() {
		this.O.setX((A.getX()+C.getX())/2);
		this.O.setY((A.getY()+C.getY())/2);
	}
	public void Rotate(double alpha) {
		A.Rotate(O, alpha);
		B.Rotate(O, alpha);
		C.Rotate(O, alpha);
		D.Rotate(O, alpha);
	}
	public void Zoom(double ratio) {
		A.Homothety(O, ratio);
		B.Homothety(O, ratio);
		C.Homothety(O, ratio);
		D.Homothety(O, ratio);
	}
	
	@Override
	public String toString() {
		return "Rectangle [A=" + A + ", B=" + B + ", C=" + C + ", D=" + D + " O="+O+"]"  ;
	}
	public static void main(String[] args) throws Exception {
		Point A =new Point(1, 1);
		Point B =new Point(2, 2);
		Point C =new Point(3, 1);
		Point D =new Point(2, 0);
		try{
			Rectangle a=new Rectangle(A,B,C,D);
//			a.Move(1, 1);
			System.out.println(a.Square());
//			a.Rotate(Math.PI);
			a.Zoom(2);
			System.out.println(a);
		}catch(Valueillegal e) {
			System.out.println(e.getMessage());
		}
		
	}
}	
