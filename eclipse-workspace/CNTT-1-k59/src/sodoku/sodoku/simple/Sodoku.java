package sodoku.simple;

import java.util.Scanner;

public class Sodoku {
	
	public static int N = 3;
	public static int N_2 = N * N;
	
	public static int a[][] = { { 5, 3, 0, 0, 7, 0, 0, 0, 0 }, { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
			{ 0, 9, 8, 0, 0, 0, 0, 6, 0 }, { 8, 0, 0, 0, 6, 0, 0, 0, 3 }, { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
			{ 7, 0, 0, 0, 2, 0, 0, 0, 6 }, { 0, 6, 0, 0, 0, 0, 2, 8, 0 }, { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
			{ 0, 0, 0, 0, 8, 0, 0, 7, 9 } };
	public static int b[][] = { { 5, 3, 0, 0, 7, 0, 0, 0, 0 }, { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
			{ 0, 9, 8, 0, 0, 0, 0, 6, 0 }, { 8, 0, 0, 0, 6, 0, 0, 0, 3 }, { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
			{ 7, 0, 0, 0, 2, 0, 0, 0, 6 }, { 0, 6, 0, 0, 0, 0, 2, 8, 0 }, { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
			{ 0, 0, 0, 0, 8, 0, 0, 7, 9 } };

	public static void main(String[] args) {
		/*
		 * Khoi tao moi truong
		 */
		Scanner sc = new Scanner(System.in);
		int r, c, v;
		
		/*
		 * Algorithm
		 */
		boolean not_end_game = true;
		while (not_end_game){
			/*
			 * Step 1 - show game
			 */
			System.out.println("Game: ");
			for (int i=0; i<N_2;i++){
				for (int j=0; j<N_2;j++){
					System.out.print(a[i][j] + "|");
				}
				System.out.println();
			}
			
			/*
			 * Step 2 - input
			 */
			System.out.println("Moi ban nhap tu 1-9");
			System.out.println("row = ");
			r = sc.nextInt() - 1;
			System.out.println("column = ");
			c = sc.nextInt() - 1;
			System.out.println("value = ");
			v = sc.nextInt();
			
			/*
			 * Step 3 - validate
			 */
			if (b[r][c] != 0){
				System.out.println("Loi roi, nhap lai di");
				continue;
			}
			int count = 0;
			for (int j=0; j<N_2; j++){
				if (a[r][j] == v){
					count ++;
				}
			}
			if (count == 1){
				System.out.println("Loi roi, nhap lai di");
				continue;
			}
			
			a[r][c] = v;
			/*
			 * Step 4 - end game?
			 */
			not_end_game = false;
			for (int i=0; i<N_2;i++){
				for (int j=0; j<N_2;j++){
					if (a[i][j] == 0){
						not_end_game = true;
					}
				}
			}
			
			if (!not_end_game){
				System.out.println("Conglatulation!");
			}
			
		}
		
		sc.close();

	}

}
