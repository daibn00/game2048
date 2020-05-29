package Game2048;

import java.awt.Color;

import javax.swing.JFrame;

public class Screen {
	public static final int margin = 2;
	public static final int widthScreen = 400 + 3*margin;
	public static final int heightScreen = 400 + 3*margin;
	
	public void setUpScreen(JFrame frame) {
		frame.setSize(widthScreen + 2*margin, heightScreen + 2*margin);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setFocusable(true);
		frame.setVisible(true);
		frame.getContentPane().setBackground(new Color(0xeee4da));
	}
	

}