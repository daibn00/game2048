import java.util.Scanner;
public class Loop {
	public static void main(String[] args) {
		int sum = 0,number;
		Scanner sc = new Scanner(System.in);
	
		while(sum < 100) {
			System.out.print("Nhap vao so nguyen bat ki : ");
			number = sc.nextInt();
			sum+=number;
		}
		System.out.println("Tong tu 1 -> 100 la : "+sum);
		sc.close();
		//tuong tu for vs do .. while
	}
   
}
