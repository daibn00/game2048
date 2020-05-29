import java.util.Scanner;

class ChangeArray{
	public void change(String a[]) {
		a[0] = "Apple";
	}
}

public class Array {
	

	
	public static void main(String[] args) {
		//cach khai bao mang 1 chieu
//		int n;
//		// KieuMang[] TenMang= new KieuMang[SoPhan tu mang]
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Nhap so phan tu cuad mang : ");
//		n = sc.nextInt();
//		int a[] = new int[n+1];
//		for(int i=0;i<n;i++) {
//			a[i] = sc.nextInt();
//		}
//		System.out.println("Cac phan tu vua nhap la : ");
//		for(int i=0;i<n;i++) {
//			System.out.print(a[i]+" ");
//		}
//		System.out.println();
//
//		for(int i=0;i<n-2;i++) {
//			for(int j = n-1;j>=i+1;j--) {
//				if(a[j]<a[j-1]) {
//					int t = a[j];
//					a[j] = a[j-1];
//					a[j-1] = t;
//				}
//			}
//		}
//		System.out.println("sau khi sap xem la : ");
//		for(int i=0;i<n;i++) {
//			System.out.print(a[i]+" ");
//		}
//		sc.close();
		ChangeArray c = new ChangeArray();
		String b[] = {"tao","Man","Hihi"};
		System.out.println("Befour " + b[0]);
		c.change(b);
		System.out.println("After " + b[0]);
		
		
		
	}
	
	
}
