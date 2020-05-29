package sodoku.oop.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import sodoku.oop.utils.Constants;
import sodoku.oop.utils.MyException;
import sodoku.oop.utils.Operations;

public class Game implements Operations {
	// Attributes
	private Node[][] game; // from 9 x 9 nodes

	// Constructors
	public Game(Node[][] game) {
		this.game = game;
	}

	public Game() {
		this.game = new Node[Constants.GAME_SIZE][Constants.GAME_SIZE];
		for (int i = 0; i < Constants.GAME_SIZE; i++) {
			for (int j = 0; j < Constants.GAME_SIZE; j++) {
				Node node = new Node(i, j, 0, false);
				this.game[i][j] = node;
			}
		}
	}

	// Getters and setters
	public Node[][] getGame() {
		return game;
	}

	public void setGame(Node[][] game) {
		this.game = game;
	}

	@Override
	public String toString() {
		return "Game [game=" + Arrays.toString(game) + ", getGame()=" + Arrays.toString(getGame()) + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public void showGame() {
		StringBuilder sdata = new StringBuilder();
		sdata.append("============== GAME ===============\n");
		for (Node[] nodes : this.game) {
			for (Node node : nodes) {
				sdata.append(node.getValue() + " | ");
			}
			sdata.append("\n");
		}
		System.out.println(sdata.toString());
	}

	public boolean isNotEndGame() {
		for (Node[] nodes : this.game) {
			for (Node node : nodes) {
				if (node.getValue() == 0) {
					return true;
				}
			}
		}
		return false;
	}

	public void validates_game(Node node) throws MyException {
		if (node.isReserved(this)) {
			throw new MyException(4, "Error: node is reserved.");
		}
		if (node.getValue()==0){
			this.setNode(node);
			return;
		}
		if (!node.isValidateByRow(this)) {
			throw new MyException(4, "Error: node value is duplicated in row.");
		}
		if (!node.isValidateByCol(this)) {
			throw new MyException(4, "Error: node value is duplicated in column.");
		}
		if (!node.isValidateByZone(this)) {
			throw new MyException(4, "Error: node value is duplicated in zone.");
		}
		this.setNode(node);
	}

	public void setNode(Node node) {
		this.game[node.getRow()][node.getCol()].setValue(node.getValue());
	}

	public Node getNode(int row, int col) {
		return this.game[row][col];
	}

	@Override
	public void readData() throws MyException {
		try {
			for (int i = 0; i < Constants.GAME_SIZE; i++) {
				for (int j = 0; j < Constants.GAME_SIZE; j++) {
					int value = Constants.DEMO_GAME_W[i][j];
					Node node = null;
					if (value == 0) {
						node = new Node(i, j, value, false);
					} else {
						node = new Node(i, j, value, true);
					}
					this.game[i][j] = node;
				}
			}
		} catch (Exception e) {
			throw new MyException(1, "Error: data input is not validate!");
		}
	}

	@Override
	public void readData(String filename) throws MyException {
		File file = null;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			// Step 1: Make a mapping with input file
			file = new File(filename);

			// Step 2: Make a file reader
			fr = new FileReader(file);

			// Step 3: Make a buffer to read data
			br = new BufferedReader(fr);

			// Step 4: Read data from buffer to variable
			String data;
			int r = 0;
			int c = 0;
			while ((data = br.readLine()) != null) {
				// Step 5: Data processing
				c = 0;
				String[] datas = data.split(" ");
				for (String d : datas) {
					int value = Integer.parseInt(d.trim());
					Node node = null;
					if (value == 0) {
						node = new Node(r, c, value, false);
					} else {
						node = new Node(r, c, value, true);
					}
					this.game[r][c] = node;
					c += 1;
				}
				r += 1;
			}
		} catch (NumberFormatException e) {
			throw new MyException(100, "Error: data input is not validate!");
		} catch (FileNotFoundException e) {
			throw new MyException(2, "Error: file input not found!");
		} catch (IOException e) {
			throw new MyException(3, "Error: cannot open the input file!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Step 6: Close all connections
			try {
				br.close();
				fr.close();
			} catch (Exception e) {
				// N.A
			}
		}
	}

	@Override
	public void saveData(String filename) throws MyException {
		File file = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			// Step 1: Make a mapping with output file
			file = new File(filename);

			// Step 2: Make a file writer
			fw = new FileWriter(file);

			// Step 3: Make a buffer to read data
			bw = new BufferedWriter(fw);

			// Step 4: Data process and write data
			for (Node[] nodes : this.game) {
				for (int j = 0; j < Constants.GAME_SIZE; j++) {
					Node node = nodes[j];
					if (j==Constants.GAME_SIZE-1){
						bw.write("" + node.getValue());
					}else{
						bw.write(node.getValue() + " ");
					}
				}
				bw.newLine();
			}
		} catch (FileNotFoundException e) {
			throw new MyException(2, "Error: file input not found!");
		} catch (IOException e) {
			throw new MyException(3, "Error: cannot open/write data to output file!");
		} finally {
			// Step 6: Close all connections
			try {
				bw.close();
				fw.close();
			} catch (Exception e) {
				// N.A
			}
		}
	}
}
