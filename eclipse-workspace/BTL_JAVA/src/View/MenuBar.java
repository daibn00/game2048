package View;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import Controller.ListenerGame;

public class MenuBar extends JMenuBar {

	private JMenu menu = new JMenu("Menu");
	private JMenu helper = new JMenu("Help");
	private JMenuItem NewGame = new JMenuItem("New");
	private JMenuItem Resume = new JMenuItem("Resume");
	private JMenuItem Save = new JMenuItem("Save");
	private JMenuItem Exit = new JMenuItem("Exit");

	public MenuBar(ListenerGame listener) {
		this.init(listener);
	}

	public void init(ListenerGame listener) {
		Save.setMnemonic(KeyEvent.VK_ESCAPE);
		KeyStroke EscOKeyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0);
		NewGame.setAccelerator(EscOKeyStroke);
		menu.add(NewGame);
		menu.addSeparator();

		Save.setMnemonic(KeyEvent.VK_R);
		KeyStroke ResumeOKeyStroke = KeyStroke.getKeyStroke("control R");
		Resume.setAccelerator(ResumeOKeyStroke);
		menu.add(Resume);
		menu.addSeparator();

		Save.setMnemonic(KeyEvent.VK_S);
		KeyStroke ctrlSKeyStroke = KeyStroke.getKeyStroke("control S");
		Save.setAccelerator(ctrlSKeyStroke);
		menu.add(Save);
		menu.addSeparator();

		Save.setMnemonic(KeyEvent.VK_S);
		KeyStroke ctrlOKeyStroke = KeyStroke.getKeyStroke("E");
		Exit.setAccelerator(ctrlOKeyStroke);

		menu.add(Exit);
		this.add(menu);
		this.add(helper);

		Resume.addActionListener(listener);
		Save.addActionListener(listener);
		Exit.addActionListener(listener);
	}

}
