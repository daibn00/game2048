package week_09;

import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends JFrame {
	
	public MenuBar() {
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setSize(400,400);
		this.setResizable(false);
		this.setLocation(500, 500);
		init();
		this.setVisible(true);
	}
	
	public void init() {
		
		
		
		final JMenuBar mainMenu = new JMenuBar();
		JMenu menu = new JMenu("File");
		JMenuItem item1 = new JMenuItem("File1");
		item1.setMnemonic(KeyEvent.VK_N);
		JMenuItem item2 = new JMenuItem("File2");
		item1.setMnemonic(KeyEvent.VK_N);
		JMenuItem item3 = new JMenuItem("File3");
		item1.setMnemonic(KeyEvent.VK_N);
		menu.add(item1);
		menu.addSeparator();
		menu.add(item2);
		menu.addSeparator();
		menu.add(item3);
		mainMenu.add(menu);
		
		this.setJMenuBar(mainMenu);
		
		
	}
	
	public static void main(String[] args) {
		MenuBar mnu = new MenuBar();
		mnu.setVisible(true);
	}

}
