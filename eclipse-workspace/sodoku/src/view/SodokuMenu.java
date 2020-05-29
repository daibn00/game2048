package view;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class SodokuMenu extends JMenuBar {
	private static final long serialVersionUID = -4576947769358333918L;
	
	private JMenuItem openMenu = new JMenuItem("Open");
	private JMenuItem saveMenu = new JMenuItem("Save");
	private JMenuItem exitMenu = new JMenuItem("Exit");

	public SodokuMenu(SodokuListener listener) {
		super();
		
		JMenu fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);

		openMenu.setMnemonic(KeyEvent.VK_O);
		KeyStroke ctrlOKeyStroke = KeyStroke.getKeyStroke("control O");
		openMenu.setAccelerator(ctrlOKeyStroke);
		openMenu.addActionListener(listener);

		saveMenu.setMnemonic(KeyEvent.VK_S);
		KeyStroke ctrlSKeyStroke = KeyStroke.getKeyStroke("control S");
		saveMenu.setAccelerator(ctrlSKeyStroke);
		saveMenu.addActionListener(listener);

		exitMenu.setMnemonic(KeyEvent.VK_X);
		exitMenu.addActionListener(listener);

		fileMenu.add(openMenu);
		fileMenu.addSeparator();
		fileMenu.add(saveMenu);
		fileMenu.addSeparator();
		fileMenu.add(exitMenu);
		this.add(fileMenu);
		
		this.setEnableMenu(false);
	}

	public void setEnableMenu(boolean status){
		this.openMenu.setEnabled(true);
		this.exitMenu.setEnabled(true);
		this.saveMenu.setEnabled(status);
	}
}
