package GameSudoku;

import java.util.Scanner;

public class gameSudoku2 {
	 public static Scanner sc = new Scanner(System.in);
	private int a[][];
	private static int b[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 8, 7, 0, 0, 0, 0, 3, 1 }, { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
			{ 0, 5, 0, 0, 9, 0, 6, 0, 0 }, { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
			{ 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

	public gameSudoku2(int a[][]) {
		this.a = a;
	}
	private void nhap() {
		int row, col;
		System.out.print("Nhap hang : ");
		row = sc.nextInt();
		System.out.print("Nhap cot : ");
		col = sc.nextInt();
		System.out.print("Nhap Gia Tri : ");
		int val = sc.nextInt();
		if (b[row][col] != 0) {
			this.nhap();
		}
		if (check(row, col, val) == false) {
			System.out.println("Vui long nhap lai ");
			a[row][col] = 0;
			this.nhap();
		} else {
			a[row][col] = val;
		}
	}
	private void xuat() {
		System.out.print("\t\t    ");
		for (int i = 0; i < 9; i++) {
			System.out.print(i + "   ");
		}
		System.out.println();
		for (int i = 0; i < 9; i++) {
			System.out.print("\t\t" + i + " | ");
			for (int j = 0; j < 9; j++) {
				System.out.print(a[i][j] + " | ");
			}
			System.out.println();
		}
	}

	private boolean check(int row, int col, int val) {
		for (int j = 0; j < 9; j++) {
			if (a[row][j] == val) {
				return false;

			}
		}
		for (int i = 0; i < 9; i++) {
			if (a[i][col] == val) {
				return false;
			}

		}
		int Row = row - row % 3;
		int Column = col - col % 3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[Row + i][Column + j] == val) {
					System.out.println(a[Row + i][Column + j]);
					return false;

				}
			}
		}

		return true;
	}

	public void checkComplete() {
		xuat();
		int k, l;
		boolean flag = true;
		while (flag) {
			this.nhap();
			this.xuat();
			flag = false;
			for (k = 0; k < 9; k++) {
				for (l = 0; l < 9; l++) {
					if (a[k][l] == 0) {
						flag = true;
					}
				}
			}
		}
		System.out.println("XIn chuc mung");
	}

	public static void main(String[] args) {
		System.out.println("Cách chơi Sudoku\r\n"
				+ "Mục tiêu của Sudoku là điền các chữ số vào một lưới (grid) 9x9 ô kẻ sao cho mỗi cột, \n"
				+ "mỗi hàng và mỗi phần 3x3 ô kẻ đều chứa các chữ số từ 1 đến 9. Đầu tiên, lưới 9x9 sẽ có một số ô \n"
				+ "đã được điền số sẵn. Công việc của bạn là sử dụng logic để điền các chữ số còn thiếu và hoàn thành lưới. \n"
				+ "Đừng quên, một lựa chọn sẽ là không chính xác nếu:\r\n" + "\r\n"
				+ "* Có bất kỳ hàng nào chứa nhiều hơn một số trùng lại trong các chữ số từ 1 đến 9\r\n"
				+ "* Có bất kỳ cột nào chứa nhiều hơn một số trùng lại trong các chữ số từ 1 đến 9\r\n"
				+ "* Bất kỳ lưới 3x3 ô nào chứa nhiều hơn một số trùng lại trong các chữ số từ 1 đến 9\n\n\n");
		gameSudoku2 g = new gameSudoku2(new int[][] {
			    { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, 
			    { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 8, 7, 0, 0, 0, 0, 3, 1 }, 
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, 
				{ 9, 0, 0, 8, 6, 3, 0, 0, 5 },
				{ 0, 5, 0, 0, 9, 0, 6, 0, 0 }, 
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0, 7, 4 },
				{ 0, 0, 5, 2, 0, 6, 3, 0, 0 } 
				});

		g.checkComplete();
        sc.close();

	
}
}
