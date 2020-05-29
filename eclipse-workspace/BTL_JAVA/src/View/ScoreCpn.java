package View;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ScoreCpn extends JPanel{
	
	private JLabel lableScore = new JLabel("Score",JLabel.CENTER);
	private JLabel score = new JLabel("",JLabel.CENTER);
	private int myScore = 0;
	
	public ScoreCpn() { 	
		this.setLayout(new GridLayout(2,1));
		lableScore.setFont(new Font("Forte", Font.PLAIN, 25));
		score.setFont(new Font("Arial", Font.PLAIN, 25));
		 this.score.setText("0");
		this.add(lableScore);
		this.add(score);
	}
	
	public void setScore(int score) {
		this.myScore = score;
        this.score.setText(this.myScore + "");
	}


	public JLabel getLableScore() {
		return lableScore;
	}
	public void setLableScore(JLabel lableScore) {
		this.lableScore = lableScore;
	}
	public JLabel getScore() {
		return score;
	}
	public void setScore(JLabel score) {
		this.score = score;
	}

}
