package Week_02;

import java.util.Scanner;

public class EX_01 {
	public static boolean CheckSNT(int n) {
		if (n < 2)
			return false;
		else {
			double c = Math.sqrt(n);
			for (int i = 2; i <= c; i++) {
				if (n % i == 0)
					return false;
			}
		}
		return true;
	}

	public static int Sum(int n) {
		int s = 0;
		for (int i = 2; i <= n; i++) {
			if (CheckSNT(i))
				s += i;
		}
		return s;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n = ");
		String n = sc.nextLine();
		int m = Integer.parseInt(n);
		System.out.println("Tong cac so nguyen to tu 2 den " + n + " la : " + Sum(m));
		sc.close();
	}

}
