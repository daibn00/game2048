package sodoku.oop;

import java.util.Scanner;

import sodoku.oop.model.Game;
import sodoku.oop.model.Node;
import sodoku.oop.utils.Constants;
import sodoku.oop.utils.MyException;

public class SodokuGame {

	public static void main(String[] args) {
		Game game = new Game();
		try {
			// Step 1 - read data
			game.readData(Constants.FILE_NAME_IN);
		} catch (MyException e) {
			System.out.println(e.toString());
			return;
		}
		
		Scanner sc = new Scanner(System.in);
		boolean not_end_game = true;
		Node node = null;
		// Loop
		while (not_end_game) {
			try {
				// Step 2 - show game
				game.showGame();

				// Step 3 - get the input values
				node = getInputData(sc);

				// Step 4 - validate rules
				game.validates_game(node);

				// Step 5 - save game to output file after each step
				game.saveData(Constants.FILE_NAME_OUT);

				// Step 6 - validate end game
				not_end_game = game.isNotEndGame();
			} catch (MyException e) {
				System.out.println(e.toString());
			}
		}
		// Finish
		System.out.println("Conglatulation! You win ...");
		sc.close();
	}

	private static Node getInputData(Scanner sc) throws MyException {
		int r, c, v;
		System.out.println("Moi ban nhap tu 1-9");
		System.out.println("row = ");
		r = sc.nextInt() - 1;
		System.out.println("column = ");
		c = sc.nextInt() - 1;
		System.out.println("value = ");
		v = sc.nextInt();

		if (r < 0 || r > 8) {
			throw new MyException(10, "Error: value of row must be from 1 to 9!");
		}
		if (c < 0 || c > 8) {
			throw new MyException(10, "Error: value of column must be from 1 to 9!");
		}
		if (v < 0 || v > 9) {
			throw new MyException(10, "Error: value of each node must be from 0 to 9!");
		}

		Node node = new Node(r, c, v, false);
		return node;
	}
}
