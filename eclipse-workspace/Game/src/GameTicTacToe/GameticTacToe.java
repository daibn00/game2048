package GameTicTacToe;

import java.io.IOException;
import java.util.Scanner;

public class GameticTacToe {
	private static final int empty = 0;
	private static final int X = 1;
	private static final int O = 2;

	private static final int playing = 0;
	private static final int draw = 1;
	private static final int X_win = 2;
	private static final int O_win = 3;

	private static final int row = 3, col = 3;
	private static final int[][] broad = new int[row][col];

	public static int currentState;

	public static int currentPlayer;
	public static int currentRow, currentCol;

	public static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		initGame();
		DrawBroad();
		do {
			playMove(currentPlayer);
			UpdateGame(currentPlayer, currentRow, currentCol);
			DrawBroad();
			if (currentState == X_win) {
				System.out.println("X WIN");
			}
			if (currentState == O_win) {
				System.out.println("O WIN");
			}
			if (currentState == draw) {
				System.out.println("Hòa");
			}
			currentPlayer = (currentPlayer==X) ? O : X;

		} while (currentState == playing);

	}

	public static void initGame() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				broad[i][j] = empty;
			}
		}
		currentState = playing;
		currentPlayer = X;
	}

	public static void playMove(int waterAway) {
		boolean valueInput = false;
		do {
			if (waterAway == X) {
				System.out.println("Đến Lượt X ");
			} else {
				System.out.println("Đến Lượt O");
			}

			int Row = sc.nextInt() - 1;
			int Col = sc.nextInt() - 1;

			if (Row < row && Col < col && Row >= 0 && Col >= 0 && broad[Row][Col] == empty) {
				currentRow = Row;
				currentCol = Col;
				broad[Row][Col] = waterAway;
				valueInput = true;
			} else {
				System.out.println("Ô Này Đã Đươc Nhập  Và not Editting");
			}
		} while (!valueInput);
	}

	public static void UpdateGame(int waterAway, int currentRow, int currentCol) {
		if (Win(currentRow, currentCol, waterAway)) {
			currentState = (waterAway == X) ? X_win : O_win;
		} else if (CheckEmpty()) {
			currentState = draw;
		}
	}

	public static boolean CheckEmpty() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (broad[i][j] == empty)
					return false;
			}
		}
		return true;
	}

	public static boolean Win(int currentRow, int currentCol, int waterAway) {

		return (broad[currentRow][0] == waterAway && broad[currentRow][1] == waterAway
				&& broad[currentRow][2] == waterAway

				|| broad[0][currentCol] == waterAway && broad[1][currentCol] == waterAway
						&& broad[2][currentCol] == waterAway

				|| broad[0][0] == waterAway && broad[1][1] == waterAway && broad[2][2] == waterAway

				|| broad[0][2] == waterAway && broad[1][1] == waterAway && broad[2][0] == waterAway);

	}

	public static void DrawBroad() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				DrawCell(broad[i][j]);
				if (j < col - 1) {
					System.out.print("|");
				}
			}
			System.out.println();
			if (i < row - 1) {
				System.out.println("--------");
			}
		}
		System.out.println();
	}

	public static void DrawCell(int x) {
		switch (x) {

		case X:
			System.out.print("X ");
			break;

		case O:
			System.out.print("O ");
			break;

		case empty:
			System.out.print("  ");
			break;
		}
	}
}
