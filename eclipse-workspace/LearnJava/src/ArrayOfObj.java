
public class ArrayOfObj {
     public static void main(String[] args) {
    	
		Accout obj[] = new Accout[2];
		obj[0] = new Accout();
		obj[1] = new Accout();
		obj[0].setData(1, 2);
		obj[1].setData(3, 4);
		System.out.println("Value obj[0]");
		obj[0].ShowData();
		System.out.println("Value obj[1]");
		obj[1].ShowData();
	}
}
class Accout{
	int a,b;
	public void setData(int c,int d) {
		a = c;
		b = d;
	}
	public void ShowData() {
		System.out.println("Value of a = "+a);
	}
}
