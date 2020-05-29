package Game2048;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;


import javax.swing.JLabel;
import javax.swing.JPanel;

public class bestScore extends JPanel {
	private JLabel title;
	private JLabel bestScore;
	public int best = 0;

	public bestScore() {
		this.setLayout(new GridLayout(2, 1));
		title = new JLabel("BEST", JLabel.CENTER);
		this.best = Integer.parseInt(File_IO.readScore());
		bestScore = new JLabel(best + "", JLabel.CENTER);
		this.add(title);
		this.add(bestScore);
		bestScore.setForeground(Color.WHITE);
		title.setForeground(Color.WHITE);
		bestScore.setFont(new Font("", Font.ITALIC, 20));
		this.setBackground(new Color(187, 173, 160));
	}

	public void setBestScore(int num) {
		this.remove(bestScore);
		this.revalidate();
		
		bestScore = new JLabel(this.best + "", JLabel.CENTER);
	
		if(num > this.best) {
			bestScore = new JLabel(num + "", JLabel.CENTER);
			File_IO.writeScore(num);
			this.best = num;
		} 
		if (num == this.best) {
			this.best = Integer.parseInt(File_IO.readScore());
		}
		
		bestScore.setFont(new Font("", Font.ITALIC, 20));
		bestScore.setForeground(Color.WHITE);
		this.add(bestScore);

	}

	

}
