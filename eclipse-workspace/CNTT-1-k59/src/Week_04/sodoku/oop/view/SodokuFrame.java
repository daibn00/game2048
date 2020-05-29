package sodoku.oop.view;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class SodokuFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	SodokuListener listener = new SodokuListener();
	SodokuPanel mainPanel = new SodokuPanel(listener);
	SodokuMenu mainMenu = new SodokuMenu(listener);

	public SodokuFrame() {
		super("Sodoku - one example game!");
		this.setLocation(100, 100);
		this.setSize(500, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		URL iconURL = this.getClass().getResource("../../../images/overview.gif");
		this.setIconImage(new ImageIcon(iconURL).getImage());

		this.setResizable(false);
		// Initialization of UI
		this.init();
	}

	private void init() {
		this.setContentPane(mainPanel);
		this.setJMenuBar(mainMenu);
		listener.setMainFrame(this);
	}

}
