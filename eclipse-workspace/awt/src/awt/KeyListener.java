package awt;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyListener extends JPanel{
	
	public KeyListener() {
		
		
		
		setFocusable(true);
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {				
				int ecode = e.getKeyCode();
				JLabel lb;
				
				if(ecode == KeyEvent.VK_LEFT) {
					 lb = new JLabel("Left");
					 add(lb);
				}else if(ecode == KeyEvent.VK_RIGHT) {
					 lb = new JLabel("right");
				}else if(ecode == KeyEvent.VK_DOWN) {
					 lb = new JLabel("down");
				}else if(ecode == KeyEvent.VK_UP) {
					 lb = new JLabel("up");
				}
				
				
			}
		});
	}
	
	
	public static void main(String[] args) {
		JFrame g = new JFrame();
		g.setSize(400, 400);
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		g.setLocation(600, 700);
		g.add(new KeyListener());
		g.setResizable(false);
		g.setVisible(true);
	}
	

}
