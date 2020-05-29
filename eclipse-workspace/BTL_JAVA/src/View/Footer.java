package View;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Footer extends JPanel{
	private JLabel stepMove = new JLabel("0 move",JLabel.CENTER);
	private JLabel restartGame = new JLabel("PRESS ESC TO RESTART GAME",JLabel.CENTER);
	private JLabel copyRight = new JLabel("<html><body>&copy; trên mạng</body></html> ",JLabel.CENTER);
	
	public Footer() {
		JPanel topFooter = new JPanel();
//		JPanel botFooter = new JPanel();
		
		topFooter.setLayout(new GridLayout(1,2,5,5));
		this.setLayout(new BorderLayout());
		this.add(topFooter, BorderLayout.CENTER);
		this.add(copyRight, BorderLayout.SOUTH);
		topFooter.add(stepMove);
		topFooter.add(restartGame);	
	}
	
	public void setStepMove(int stepMove) {
		this.stepMove.setText(stepMove + " move");
	}

}
