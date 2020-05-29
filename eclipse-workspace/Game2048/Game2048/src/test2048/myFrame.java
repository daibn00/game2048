package test2048;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class myFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final int CENTER = 0;

	public myFrame() {
		super("Game");

		// Thiết lập các thông số giao diện
		this.setLocation(560, 315);
		this.setSize(600, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.initMenu();
		this.init();
		this.setVisible(true);

	}

	private void initMenu() {
		// menuBar
		JMenuBar menuBar = new JMenuBar();

		// menu level 1
		JMenu gameMenu = new JMenu("Game");
		JMenu optionMenu = new JMenu("Options");
		JMenu helpMenu = new JMenu("Help");

		// menuItem of menu level 1
		JMenuItem open = new JMenuItem("New");
		JMenuItem resume = new JMenuItem("Resume");
		JMenuItem pauseSave = new JMenuItem("Pause & Save");
		JMenuItem exit = new JMenuItem("Exit");

		JMenuItem suppot = new JMenuItem("Suppot");
		JMenuItem rule = new JMenuItem("Rule");

		// add menuItem to menu lv1
		gameMenu.add(open);
		gameMenu.add(resume);
		gameMenu.addSeparator();
		gameMenu.add(pauseSave);
		gameMenu.addSeparator();
		gameMenu.add(exit);

		helpMenu.add(suppot);
		helpMenu.add(rule);

		// add menu to menuBar
		menuBar.add(gameMenu);
		menuBar.add(optionMenu);
		menuBar.add(helpMenu);

		this.setJMenuBar(menuBar);
	}

	private void init() {
		// panel
		JPanel mainPanel = new JPanel();
		JPanel centerPanel = new JPanel();
		JPanel southPanel = new JPanel();
		JPanel eastPanel = new JPanel();
		JPanel westPanel = new JPanel();
		JPanel eastSouthPanel = new JPanel();
		JPanel eastNorthPanel = new JPanel();

		// Layout
		mainPanel.setLayout(new BorderLayout());
		centerPanel.setLayout(new GridLayout(4, 4, 1, 1));
		eastPanel.setLayout(new GridLayout(2, 1));
		mainPanel.add(centerPanel, BorderLayout.CENTER);
		mainPanel.add(southPanel, BorderLayout.SOUTH);
		mainPanel.add(eastPanel, BorderLayout.EAST);
		//mainPanel.add(westPanel, BorderLayout.WEST);
		eastSouthPanel.setLayout(new GridLayout(3, 3, 2, 2));
		eastPanel.add(eastNorthPanel);
		eastPanel.add(eastSouthPanel);

		// label
		JLabel txt_1 = new JLabel("score: ");
		JLabel txt_2 = new JLabel(" or press ESC to exit game!");

		// textFeild
		for (int i = 0; i < 16; i++) {
			JLabel lb = new JLabel("0", CENTER);
			lb.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
			centerPanel.add(lb);
		}
//		JTextField ta_1 = new JTextField("1");
//		ta_1.setEditable(false);
//		JTextField ta_2 = new JTextField("2");
//		JTextField ta_3 = new JTextField("3");
//		JTextField ta_4 = new JTextField("4");
//		JTextField ta_5 = new JTextField("1");
//		JTextField ta_6 = new JTextField("6");
//		JTextField ta_7 = new JTextField("7");
//		JTextField ta_8 = new JTextField("8");
//		JTextField ta_9 = new JTextField("9");
//		JTextField ta_10 = new JTextField("10");
//		JTextField ta_11 = new JTextField("11");
//		JTextField ta_12 = new JTextField("12");
//		JTextField ta_13 = new JTextField("13");
//		JTextField ta_14 = new JTextField("14");
//		JTextField ta_15 = new JTextField("15");
//		JTextField ta_16 = new JTextField("16");

		JLabel lbEast_1 = new JLabel();
		JLabel lbEast_2 = new JLabel();
		JLabel lbEast_3 = new JLabel();
		JLabel lbEast_4 = new JLabel();

//		ta_1.setBackground(Color.CYAN);

		JTextField tf_1 = new JTextField("Score");

		// button
		JButton bt_1 = new JButton("Click here!");
		JButton btEast_1 = new JButton("Up");
		JButton btEast_2 = new JButton("Left");
		JButton btEast_3 = new JButton("Down");
		JButton btEast_4 = new JButton("Right");
		JButton btEast_5 = new JButton("Pause");

		// add to centerPanel
//		centerPanel.add(ta_1);
//		centerPanel.add(ta_2);
//		centerPanel.add(ta_3);
//		centerPanel.add(ta_4);
//		centerPanel.add(ta_5);
//		centerPanel.add(ta_6);
//		centerPanel.add(ta_7);
//		centerPanel.add(ta_8);
//		centerPanel.add(ta_9);
//		centerPanel.add(ta_10);
//		centerPanel.add(ta_11);
//		centerPanel.add(ta_12);
//		centerPanel.add(ta_13);
//		centerPanel.add(ta_14);
//		centerPanel.add(ta_15);
//		centerPanel.add(ta_16);

		centerPanel.setEnabled(false);

		// add to eastPanel
		eastNorthPanel.add(txt_1);
		eastNorthPanel.add(tf_1);

		// add to eastTwoPanel
		eastSouthPanel.add(lbEast_1);
		eastSouthPanel.add(btEast_1);
		eastSouthPanel.add(lbEast_2);
		eastSouthPanel.add(btEast_2);
		eastSouthPanel.add(btEast_5);
		eastSouthPanel.add(btEast_3);
		eastSouthPanel.add(lbEast_3);
		eastSouthPanel.add(btEast_4);
		eastSouthPanel.add(lbEast_4);

		// add to southPanel
		southPanel.add(bt_1);
		southPanel.add(txt_2);

		centerPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		//
		this.setContentPane(mainPanel);
	}

}
