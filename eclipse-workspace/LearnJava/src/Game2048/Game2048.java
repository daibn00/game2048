package Game2048;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Game2048 extends JPanel {
	
	
	JFrame game;
	Screen sc;
	

	public Game2048() {
		init();
		setUp();
		setFocusable(true);

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
					System.out.println("ESC");
				}
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					System.out.println("LEFT");
					break;
				case KeyEvent.VK_RIGHT:
					System.out.println("RIGHT");
					break;
				case KeyEvent.VK_UP:
					System.out.println("UP");
					break;
				case KeyEvent.VK_DOWN:
					System.out.println("DOWN");
					break;

				}

			}

		});

	}
	
	public void init() {
		game = new JFrame();
		sc = new Screen();
	}
	private void setUp() {
		sc.setUpScreen(game);;
	}
	
	public void runGame() {
		game.setVisible(true);
	}

	public static void main(String[] args) {
		Game2048 game = new Game2048();
		game.runGame();
		
	}

}
