package Week_02;

import java.util.Scanner;

public class EX_02 {
	public float TB;
	public float TB() {
		return TB;
	}
	
	public void Info() {
		System.out.println(this.TB());
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a[] = new int[n + 1];
		int s = 0;
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
			if (a[i] % 3 == 0) {
				s += a[i];
			}
		}
		System.out.println("s = " + s);
		double S = 0;
		for (int i = 1; i <= n; i++) {
			S += (double)(i * i / a[i]) * Math.pow(-1, i - 1);
		}
		System.out.println("S = " + S);
		int max = a[1];
		for (int i = 1; i <= n; i++)
			if (max < a[i] && a[i]%3==0)
				max = a[i];

		System.out.println("Max = " + max);

		sc.close();

	}

}
