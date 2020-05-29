package Week_03;

public class utils {
	public static int UCLN(int a,int b) {
		if(a==0) return b;
		if(b==0) return a;
		if(a<b) return UCLN(a,b%a);
		else return UCLN(a%b,b);
	}
     
}
