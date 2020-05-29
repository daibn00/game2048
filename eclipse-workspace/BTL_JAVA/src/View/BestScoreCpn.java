package View;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import modal.File_Io_bestScore;

public class BestScoreCpn extends JPanel{
	
	private JLabel lableBestScore = new JLabel("Best",JLabel.CENTER);
	private JLabel score = new JLabel(File_Io_bestScore.readScore(),JLabel.CENTER );
	private int bestScore = 0;
	
	public BestScoreCpn() {
		GridLayout gridlayout = new GridLayout(2,1,3,0);
		lableBestScore.setFont(new Font("Forte", Font.BOLD, 25));
		score.setFont(new Font("Arial", Font.PLAIN, 25));
		this.setLayout(gridlayout);
		
		this.add(lableBestScore);
		this.add(score);
	}
	
	public void setBestScore(int score) {
		this.bestScore = score;
        this.score.setText(this.bestScore + "");
	}
	
	public JLabel getLableScore() {
		return lableBestScore;
	}
	public void setLableScore(JLabel lableScore) {
		this.lableBestScore = lableScore;
	}
	public JLabel getScore() {
		return score;
	}
	public void setScore(JLabel score) {
		this.score = score;
	}

}
