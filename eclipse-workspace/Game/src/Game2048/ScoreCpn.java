package Game2048;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;


import javax.swing.JLabel;
import javax.swing.JPanel;

public class ScoreCpn extends JPanel {
	private JLabel titleScore;
	private JLabel myScore;
	private int score = 0;

	public ScoreCpn() {
		this.setLayout(new GridLayout(2, 1));
		titleScore = new JLabel("SCORE", JLabel.CENTER);
		myScore = new JLabel("0", JLabel.CENTER);
		this.add(titleScore);
		this.add(myScore);
		titleScore.setForeground(Color.WHITE);
		myScore.setForeground(Color.WHITE);
		myScore.setFont(new Font("", Font.ITALIC, 20));
		this.setBackground(new Color(187, 173, 160));
	}

	public void setScore(int num) {
		if(num > Integer.parseInt(File_IO.readScore()))  {
			File_IO.writeScore(score);
		}
		this.remove(myScore);
		this.revalidate();
		this.score = num;
		myScore = new JLabel(this.score + "", JLabel.CENTER);
		myScore.setFont(new Font("", Font.ITALIC, 20));
		myScore.setForeground(Color.WHITE);
		this.add(myScore);

	}

	
}
