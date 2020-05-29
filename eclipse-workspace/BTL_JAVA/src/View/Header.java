package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controller.Broad;
import Controller.ListenerGame;

public class Header extends JPanel {
	private JLabel titleGame = new JLabel("2048",JLabel.CENTER);
    private BestScoreCpn bestScore = new BestScoreCpn();
    private ScoreCpn Score = new ScoreCpn();
	private JButton btnBack = new JButton("Back");
    

    public Header(ListenerGame listener) {
    	this.setLayout(new GridLayout(1,4,3,3));
//    	titleGame.setBackground(new Color(255,205,0));
    	titleGame.setPreferredSize(new Dimension(100, 25));
    	titleGame.setFont(new Font("Forte", Font.BOLD, 35));
    	titleGame.setOpaque(true);
    	this.add(titleGame);
    	this.add(Score);
    	this.add(bestScore);
    	this.add(btnBack);
    	btnBack.setOpaque(true);
    	btnBack.setBackground(new Color(0xEEE5DE));
    	btnBack.addActionListener(listener);
    	System.out.println(listener);
    	
    	try {
			BufferedImage bi = ImageIO.read(new File("./assets/Back.png"));
			ImageIcon icon = new ImageIcon(bi.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
			btnBack.setIcon(icon);
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    }
    
    public Header() {
    	
    }
    
	public void setFocusableButton() {
		this.btnBack.setFocusable(false);
	}
    public ScoreCpn getScore() {
		return Score;
	}
    
    public BestScoreCpn getBestScore() {
		return bestScore;
	}

	public void setScore(ScoreCpn score) {
		Score = score;
	}

	

}
