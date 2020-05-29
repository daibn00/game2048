package View;

import java.awt.Color;
import java.awt.Font;
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
		for (int i = 0; i < 16; i++) this.add(nodes[i]);
	}

	public void init() {
		for (int i = 0; i < 16; i++) {
			nodes[i].setFont(new Font("Cooper Black", Font.PLAIN, 32));;
			nodes[i].setOpaque(true);
			int value = broad.getMyTiles()[i].getValue();
//			nodes[i].setBorder(new RoundedBorder(Color.BLACK, 20));
			if (value > 0) {
				nodes[i].setText(value + "");
			} else {
				nodes[i].setText("");
			}
			nodes[i].setBackground(broad.getMyTiles()[i].getBackground());
			nodes[i].setHorizontalAlignment(SwingConstants.CENTER);
			
		}
	}

	public Broad getBroad() {
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
