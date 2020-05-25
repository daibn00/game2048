package View;

import javax.swing.JFrame;

import Controller.ListenerGame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;



public class Frame2048 extends JFrame {
	public ListenerGame listener  = new ListenerGame();
	public GamePanelCpn mainGame = new GamePanelCpn(listener);
	
	JMenuBar mainMenu = new JMenuBar();	
	JMenu menu = new JMenu("Control");
	JMenuItem NewGame = new JMenuItem("NewGame");
	JMenuItem Resume = new JMenuItem("Resume");
	JMenuItem Save = new JMenuItem("Save");
	JMenuItem Exit = new JMenuItem("Exit");

	public Frame2048() {
		super("Game 2048");
		this.setSize(400, 500);
		this.setLocation(500, 400);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.init();
	}
	public void init() {
		this.add(mainGame);
		this.addMenuBar();
		this.setVisible(true);
		listener.setMain(this);
		
	}
	
	public void addMenuBar() {

		menu.add(NewGame);
		menu.addSeparator();
		menu.add(Resume);
		menu.addSeparator();
		menu.add(Save);
		menu.addSeparator();
		menu.add(Exit);
		mainMenu.add(menu);
		NewGame.addActionListener(listener);
		Resume.addActionListener(listener);
		Save.addActionListener(listener);
		Exit.addActionListener(listener);
		this.setJMenuBar(mainMenu);
	}

	
	public static void main(String[] args) {
		Frame2048 g = new Frame2048();
		g.setVisible(true);
	}
	

}
