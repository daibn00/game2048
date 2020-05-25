package View;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controller.Broad;
import Controller.ListenerGame;

public class NorthCpn extends JPanel {
	private JLabel titleGame = new JLabel("2048",JLabel.CENTER);
    private BestScoreCpn bestScore = new BestScoreCpn();
    private ScoreCpn Score = new ScoreCpn();
	private JButton btnBack = new JButton("Back");
    

    public NorthCpn(ListenerGame listener) {
    	this.setLayout(new GridLayout(1,4,3,3));
    	this.add(titleGame);
    	this.add(Score);
    	this.add(bestScore);
    	this.add(btnBack);
    	btnBack.addActionListener(listener);
    	System.out.println(listener);
    	
    }
    
    public NorthCpn() {
    	
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
