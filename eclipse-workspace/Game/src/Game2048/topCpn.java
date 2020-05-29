package Game2048;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class topCpn extends JPanel implements ActionListener {
	
	private JLabel titleGame;
	private ScoreCpn Score;
	private JButton goBack = new JButton("Quay Lai");
	private bestScore bestScore;
	private Broad g;
	private int score = 0;
	CpnMain mainFrame;
	public topCpn() {
		bestScore = new bestScore();
		Score =new ScoreCpn();
		titleGame = new JLabel("2048",JLabel.CENTER);
		titleGame.setFont(new Font("Montserrat",Font.BOLD, 30));
		this.setLayout(new GridLayout(1, 3,10,10));	
		goBack.addActionListener(this);
		this.add(titleGame);
		this.add(Score);
		this.add(bestScore);
		this.add(goBack);
		this.setOpaque(false);
			
	}
	
	public int getBestScore() {
		return bestScore.best;
	}
	
  
	
	public void setMainFrame(CpnMain mainFrame) {
		this.mainFrame = mainFrame;
	}
	
	private void init() {
		Score.setScore(score);
		bestScore.setBestScore(score);
	}
	public void setScore(int num, Broad g) {
		this.g = g;
		this.score = num;
		init();
	}

	@Override
	public void actionPerformed(ActionEvent e) {	
		String cmd = e.getActionCommand();
		if("Quay Lai".equals(cmd)) {
			goBack.setFocusable(false);
			System.out.println(e.getActionCommand());
			g.previousTurn();	
			g.paint();
			
		}
		
		
	}
	

}
