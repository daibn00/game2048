package View;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Constant.Constant;
import Controller.ListenerGame;

public class Helper extends JPanel {

	ListenerGame listenr = new ListenerGame();
	private JLabel imgHelper1 = null;
	private JLabel imgHelper2 = null;

	private JButton Play = new JButton("LET'S PLAY!");
	private int slickLayout = 1;
	
	
	public Helper(ListenerGame listenr) {
		this.listenr = listenr;
		this.init();
	}

	public int getSlickLayout() {
		return slickLayout;
	}

	public void setSlickLayout(int slickLayout) {
		this.slickLayout = slickLayout;
	}



	public void init() {
		// this.setSize(200, 200);
		try {
			if (this.getSlickLayout() == 0) {
				imgHelper1 = new JLabel(new ImageIcon(
						ImageIO.read(new File("./assets/help2.jpg")).getScaledInstance(400, 460, Image.SCALE_SMOOTH)));
				imgHelper1.setSize(200, 100);
				this.add(imgHelper1);
			} else {

				this.setLayout(null);

				try {
					imgHelper2 = new JLabel(new ImageIcon(ImageIO.read(new File("./assets/mainContentImg.jpg"))
							.getScaledInstance(400, 460, Image.SCALE_SMOOTH)));
				} catch (IOException e1) {
					e1.printStackTrace();
				}

				this.add(imgHelper2);
				imgHelper2.setSize(380, 460);
				Play.setSize(222, 40);
				Play.setLocation(80, 350);
				try {
					BufferedImage bi = ImageIO.read(new File("./assets/play.jpg"));
					ImageIcon icon = new ImageIcon(bi.getScaledInstance(300, 60, Image.SCALE_SMOOTH));
					Play.setIcon(icon);
				} catch (IOException e) {
					e.printStackTrace();
				}
				this.add(Play);

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
