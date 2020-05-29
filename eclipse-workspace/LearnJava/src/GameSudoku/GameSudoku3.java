package GameSudoku;

public class GameSudoku3 {

	private int a[][];

	public GameSudoku3(int a[][]) {
		this.a = a;
	}

	public boolean nhap() {
		int i = 0, j = 0;
		boolean checkFlag = false;
		for (int ii = 0; ii < 9 && !checkFlag; ii++) {
			for (int jj = 0; jj < 9 && !checkFlag; jj++) {

				if (a[ii][jj] == 0) {
					checkFlag = true;
					i = ii;
					j = jj;
				}

			}
		}
		if (!checkFlag) {  
			return true;
		}
		for (int x = 1; x < 10; x++) {
			if (check(i, j, x)) {
				a[i][j] = x;
				if (nhap()) {
					return true;
				}
				a[i][j] = 0;
			}
		}
		return false;

	}

	public boolean check(int row, int col, int k) {
		for (int j = 0; j < 9; j++) {

			if (a[row][j] == k) {
				return false;

			}
		}
		for (int i = 0; i < 9; i++) {

			if (a[i][col] == k) {
				return false;

			}
		}
		int Row = row - row % 3;
		int Column = col - col % 3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[Row + i][Column + j] == k) {
					return false;

				}
			}
		}

		return true;
	}

	public void solve() {

		if (!nhap()) {
			System.out.println("This sudoku can't be solved.");
		}

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
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
		GameSudoku3 g = new GameSudoku3(new int[][] { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 8, 7, 0, 0, 0, 0, 3, 1 }, { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
				{ 0, 5, 0, 0, 9, 0, 6, 0, 0 }, { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
				{ 0, 0, 5, 2, 0, 6, 3, 0, 0 } });

		g.solve();

	}
}
