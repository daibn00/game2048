package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

import model.Game;
import model.Node;
import utils.Constants;

public class SodokuPanel extends JPanel {

	private static final long serialVersionUID = 4565505273631849633L;

	/*
	 * Define all UI components
	 */
	private JPanel centerPanel = new JPanel();
	private JPanel southPanel = new JPanel();
	private JPanel choosePanel = new JPanel();
	private JPanel actionPanel = new JPanel();
	

	JButton[] chooseBtns = new JButton[10];
	JButton exitBtn = new JButton("Exit");

	/*
	 * Game
	 */
	private SodokuLabel[][] nodeLbls = new SodokuLabel[9][9];
	private Game game = new Game();

	public SodokuPanel(SodokuListener listener) {
		super();
		// main panel
		this.setLayout(new BorderLayout());
		centerPanel.setBorder(BorderFactory.createTitledBorder("Game"));
		southPanel.setBorder(BorderFactory.createTitledBorder("Actions"));
		
		SodokuToolbar toolBar = new SodokuToolbar(listener);
		this.add(toolBar, BorderLayout.NORTH);
		this.add(centerPanel, BorderLayout.CENTER);
		this.add(southPanel, BorderLayout.SOUTH);

		// center panel
		centerPanel.setLayout(new GridLayout(9, 9));
		for (int i = 0; i < Constants.GAME_SIZE; i++) {
			for (int j = 0; j < Constants.GAME_SIZE; j++) {
				nodeLbls[i][j] = new SodokuLabel(game.getNode(i, j), false);
				centerPanel.add(nodeLbls[i][j]);
				nodeLbls[i][j].addMouseListener(listener);
			}
		}

		// south panel
		southPanel.setLayout(new BorderLayout());
		southPanel.add(choosePanel, BorderLayout.NORTH);
		southPanel.add(actionPanel, BorderLayout.SOUTH);

		// choose panel
		choosePanel.setLayout(new GridLayout(1, 10));
		for (int i = 0; i < 10; i++) {
			chooseBtns[i] = new JButton("" + i);
			choosePanel.add(chooseBtns[i]);
			chooseBtns[i].addActionListener(listener);
		}

		// action panel
		actionPanel.add(exitBtn);

		// add all action listeners
		exitBtn.addActionListener(listener);
	}

	public Game getGame() {
		return this.game;
	}

	public void refreshGame() {
		for (int i = 0; i < Constants.GAME_SIZE; i++) {
			for (int j = 0; j < Constants.GAME_SIZE; j++) {
				nodeLbls[i][j].setNode(game.getNode(i, j));
				nodeLbls[i][j].setSelected(false);
				nodeLbls[i][j].setBackground();
				nodeLbls[i][j].setForeground();
			}
		}
	}

	public void refreshGame(Node node) {
		this.game.setNode(node);
		nodeLbls[node.getRow()][node.getCol()].setNode(game.getNode(node.getRow(), node.getCol()));
	}
}
