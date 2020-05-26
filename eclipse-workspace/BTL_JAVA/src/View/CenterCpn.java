package View;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Controller.Broad;
import Controller.ListenerGame;
import Controller.Tile;

public class CenterCpn extends JPanel {
	private JLabel[] nodes = { new JLabel(), new JLabel(), new JLabel(), new JLabel(), new JLabel(), new JLabel(),
			new JLabel(), new JLabel(), new JLabel(), new JLabel(), new JLabel(), new JLabel(), new JLabel(),
			new JLabel(), new JLabel(), new JLabel() };
	private Broad broad = new Broad();

	public CenterCpn() {
		this.setLayout(new GridLayout(4, 4, 3, 3));
	}
	Font labelFont = new Font("Brush Script Std", Font.PLAIN, 30);

	public void init() {
		for (int i = 0; i < 16; i++) {
			nodes[i].setFont(labelFont);
			nodes[i].setOpaque(true);
			int value = broad.getMyTiles()[i].getValue();
			if (value > 0) {
				nodes[i].setText(value + "");
			} else {
				nodes[i].setText("");
			}
			nodes[i].setBackground(broad.getMyTiles()[i].getBackground());
			nodes[i].setHorizontalAlignment(SwingConstants.CENTER);
			this.add(nodes[i]);
		}
	}

	public Broad getBroad() {
		System.out.println(1);
		return broad;
	}

	public void setBroad(Broad broad) {
		
		this.broad = broad;
		this.init();
	}

//	public void setMytile(Tile[] backTile) {
//		this.broad.setMyTiles(backTile);
//		for (int i = 0; i < 16; i++) {
//			
//			System.out.println(backTile);
//		}
//		this.init();
//	}

	public void setFocusPanel() {
		this.setFocusable(true);
	}

}
