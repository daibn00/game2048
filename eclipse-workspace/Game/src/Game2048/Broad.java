package Game2048;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.JOptionPane;
public class Broad extends JPanel {
	private static final String FONT_NAME = "Arial";
    private  int GAME_SIZE = 10000000;
	private Tile[] myTiles;
	private Tile[] backMyTiles = new Tile[GAME_SIZE * GAME_SIZE];
	boolean Win = false;
	boolean Lose = false;
	int myScore = 0;
	int backScore = 0;
	int stepMove = 0;

//	public Broad() {
//		resetGame();
//		this.paint();
//		this.setLayout(new GridLayout(GAME_SIZE, GAME_SIZE, 4, 4));
//	}
//	
	public void setGameSize(int num) {
		this.GAME_SIZE = num;
		resetGame();
		this.paint();
		this.setLayout(new GridLayout(GAME_SIZE, GAME_SIZE, 4, 4));
	}

	private void move() {
		boolean needAddTile = false;
		for (int i = 0; i < GAME_SIZE; i++) {
			Tile[] line = getLine(i);
			Tile[] newLine = mergeLine(moveLine(line));
			setLine(i, newLine);
			if (compare(line, newLine)) {
				needAddTile = true;
			}
		}
		if (needAddTile) {
			addTile();
			stepMove++;
		}
	}

	public void left() {
		backMyTiles = myTiles;
		move();
	}

	public void right() {
		backMyTiles = myTiles;
		backScore = myScore;
		myTiles = rotate(180);
		move();
		myTiles = rotate(180);

	}

	public void up() {
		backMyTiles = myTiles;
		backScore = myScore;
		myTiles = rotate(270);
		move();
		myTiles = rotate(90);
	}

	public void down() {
		backMyTiles = myTiles;
		backScore = myScore;
		myTiles = rotate(90);
		move();
		myTiles = rotate(270);
	}

	public void previousTurn() {
		myScore = backScore;
		myTiles = backMyTiles;
	}

	public void resetGame() { // function reset game
		this.Win = false;
		this.Lose = false;
		this.myScore = 0;
		this.stepMove = 0;
		this.myTiles = new Tile[GAME_SIZE * GAME_SIZE];
		for (int i = 0; i < myTiles.length; i++) {
			myTiles[i] = new Tile();
			backMyTiles[i] = new Tile();
		}
		addTile();
		addTile();

	}

	public Tile tileAt(int x, int y) {
		return myTiles[x + y * GAME_SIZE]; // x la cot y la hang
	}

	public void addTile() { // function them 1 o nua
		List<Tile> l = this.availableSpace();
		if (!availableSpace().isEmpty()) {
			int index = (int) (Math.random() * l.size());
			int value = Math.random() < 0.9 ? 2 : 4;
			l.get(index).setValue(value);
		}

	}

	public List<Tile> availableSpace() { // function xem con khoang chong khong
		List<Tile> l = new ArrayList<Tile>(16);
		for (Tile t : myTiles) {
			if (t.isEmpty()) {
				l.add(t);
			}
		}
		return l;
	}

	public boolean isFull() {
		return availableSpace().isEmpty();
	}

	public boolean canMove() { // functin xem cos the di tiep hay khong
		if (!isFull()) {
			return true;
		}

		for (int x = 0; x < GAME_SIZE; x++) {
			for (int y = 0; y < GAME_SIZE; y++) {
				Tile t = tileAt(y, x);
				if ((x < 3 && t.value == tileAt(y + 1, x).value) || (y < 3 && t.value == tileAt(x, y + 1).value)) {

					return true;
				}
			}
		}
		return false;

	}

	public Tile[] getLine(int index) {
		Tile[] result = new Tile[GAME_SIZE];
		for (int x = 0; x < GAME_SIZE; x++) {
			result[x] = tileAt(x, index);
		}

		return result;
	}

	private Tile[] rotate(int angle) {

		if (angle == 0) {
			return myTiles;
		}

		Tile[] newTiles = new Tile[GAME_SIZE * GAME_SIZE];
		int offsetX = GAME_SIZE - 1, offsetY =  GAME_SIZE - 1;
		if (angle == 90) {
			offsetY = 0;
		} else if (angle == 270) {
			offsetX = 0;
		}

		double rad = Math.toRadians(angle);
		int cos = (int) Math.cos(rad);
		int sin = (int) Math.sin(rad);
		// System.out.println(rad + " " + cos + " " + sin);
		for (int x = 0; x < GAME_SIZE; x++) {
			for (int y = 0; y < GAME_SIZE; y++) {
				int newX = (x * cos) - (y * sin) + offsetX;
				int newY = (x * sin) + (y * cos) + offsetY;
				System.out.println(newX +" "+ newY);
				newTiles[(newX) + (newY) * GAME_SIZE] = tileAt(x, y);
			}
		}
		return newTiles;
	}

	public Tile[] moveLine(Tile[] oldLine) {
		List<Tile> l = new ArrayList<Tile>();

		for (int i = 0; i < GAME_SIZE; i++) {
			if (!oldLine[i].isEmpty()) {
				l.add(oldLine[i]);
			}
		}
		if (l.size() == 0) {
			return oldLine;
		} else {
			Tile[] newLine = new Tile[GAME_SIZE];
			ensureSize(l, GAME_SIZE);
			for (int i = 0; i < GAME_SIZE; i++) {
				newLine[i] = l.get(i);
			}
			return newLine;
		}

	}

	public Tile[] mergeLine(Tile[] oldLine) {
		List<Tile> l = new ArrayList<Tile>();
		for (int i = 0; i < GAME_SIZE && !oldLine[i].isEmpty(); i++) {
			int num = oldLine[i].value;
			if (i < 3 && oldLine[i].value == oldLine[i + 1].value) {
				num *= 2;
				myScore += num;
				if (myScore == 2048) {
					Win = true;
				}
				i++;
			}
			l.add(new Tile(num));
		}
		if (l.size() == 0) {
			
			return oldLine;
		} else {
			ensureSize(l, GAME_SIZE);
			return l.toArray(new Tile[GAME_SIZE]);
		}
	}

	public void setLine(int index, Tile[] newLine) {
		for (int i = 0; i < GAME_SIZE; i++) {
			myTiles[i + index * GAME_SIZE] = newLine[i];
		}
	}

	public void ensureSize(List<Tile> l, int s) {

		while (l.size() != s) {
			l.add(new Tile());
		}
	}

	private boolean compare(Tile[] line1, Tile[] line2) {
		for (int i = 0; i < line1.length; i++) {
			if (line1[i].value != line2[i].value) {
				return true;
			}
		}
		return false;
	}

	public void paint() {
		removeAll();
		revalidate();
		// repaint();
		for (int y = 0; y < GAME_SIZE; y++) {
			for (int x = 0; x < GAME_SIZE; x++) {
				JLabel node =  new JLabel("", JLabel.CENTER);
				node.setText("" + myTiles[x + y * GAME_SIZE].value);
				if (myTiles[x + y * GAME_SIZE].value == 0) {
					node.setText("");
				}			
				node.setOpaque(true);
				node.setFont(new Font(FONT_NAME, Font.BOLD, 20));
				node.setForeground(myTiles[x + y * GAME_SIZE].getForeground());
				Border border = new LineBorder(Color.BLACK, GAME_SIZE);
				node.setBorder(border);
				node.setBackground(myTiles[x + y * GAME_SIZE].getBackground());
				this.add(node);
			}
		}
	}

}
