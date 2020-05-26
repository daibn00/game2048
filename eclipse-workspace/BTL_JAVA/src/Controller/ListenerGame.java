package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import View.Frame2048;
import modal.File_Io_bestScore;
import modal.saveDataDB;

public class ListenerGame implements KeyListener, ActionListener {
	private Broad g = new Broad();
	private Frame2048 mainFrame;

	public void setMain(Frame2048 mainFrame) {
		this.mainFrame = mainFrame;
		this.mainFrame.mainGame.centerPanel.setBroad(g);
	}

	public void rePaint(int score) {
		this.mainFrame.mainGame.centerPanel.setBroad(g);
		this.mainFrame.mainGame.centerPanel.init();
		this.mainFrame.mainGame.nouthPanel.getScore().setScore(score);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// TODO Auto-generated method stub

		if ("Back".equals(e.getActionCommand())) {
			this.mainFrame.mainGame.nouthPanel.setFocusableButton();
			this.mainFrame.mainGame.centerPanel.setFocusPanel();
			g.setMyTiles(g.getBackMyTiles());
//			g.setMyScore();(g.getBackScore());
			System.out.println(g.getMyScore());
			this.rePaint(g.getBackScore());
		}

		if ("NewGame".equalsIgnoreCase(e.getActionCommand())) {
			g.resetGame();
			this.rePaint(g.getMyScore());
		}

		if ("Resume".equalsIgnoreCase(e.getActionCommand())) {
			String[] data = saveDataDB.getDataDb().split(" ");
			String scoreDb = saveDataDB.getDataDb().split(" ")[16];
			g.setMyScore(Integer.parseInt(scoreDb));
			this.mainFrame.mainGame.nouthPanel.getScore().setScore(Integer.parseInt(scoreDb));
			for (int i = 0; i < 16; i++) {
				g.getMyTiles()[i].setValue(Integer.parseInt(data[i]));
			}
			this.mainFrame.mainGame.centerPanel.setBroad(g);
			this.mainFrame.mainGame.centerPanel.init();
		}

		if ("Save".equals(e.getActionCommand())) {

			String data = "";
			for (int i = 0; i < 16; i++) {
				data += (this.g.getMyTiles()[i].getValue() + " ");
			}
			saveDataDB.insertDataDb(data, g.getMyScore());

		}
		if ("Exit".equals(e.getActionCommand())) {
			System.exit(0);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_ESCAPE) {
			g.resetGame();
		}

		if (!g.isWin() && !g.isLose()) {
			switch (keyCode) {

			case KeyEvent.VK_SPACE:
				g.previousTurn();
				break;

			case KeyEvent.VK_LEFT:
				g.left();

				break;
			case KeyEvent.VK_RIGHT:
				g.right();

				break;
			case KeyEvent.VK_UP:
				g.up();

				break;
			case KeyEvent.VK_DOWN:
				g.down();

				break;
			}
			this.rePaint(g.getMyScore());

			if (g.getMyScore() < Integer.parseInt(File_Io_bestScore.readScore())) {
				this.mainFrame.mainGame.nouthPanel.getBestScore()
						.setBestScore(Integer.parseInt(File_Io_bestScore.readScore()));
			} else {
				this.mainFrame.mainGame.nouthPanel.getBestScore().setBestScore(g.getMyScore());
				File_Io_bestScore.writeScore(g.getMyScore());
			}

			this.mainFrame.mainGame.southPanel.setStepMove(g.getStepMove());

//			if (!g.canMove()) {
//				g.setLose(true);
//				
//			}
//			if(g.isWin()) {
//			System.out.println(11111);
//				JOptionPane.showMessageDialog(this.mainCpn, "You thắng","Yoi Win" ,JOptionPane.ERROR_MESSAGE);
//				int continues = JOptionPane.showConfirmDialog(this.mainCpn, "Do You Want To Continue ?", "YES NO QUESTION ? ", JOptionPane.YES_NO_OPTION);
//				if(continues == 0) {
//					g.setWin(false) ;
//				}
//				
//			}
//			if (!g.canMove()) {
//				g.setLose(true) ;
//				JOptionPane.showMessageDialog(this.mainCpn, "You thua","Bạn Thua" ,JOptionPane.ERROR_MESSAGE);
//				int continues = JOptionPane.showConfirmDialog(this.mainCpn, "Do You Want To Continue ?", "YES NO QUESTION ? ", JOptionPane.YES_NO_OPTION);
//				if(continues == 0) {
//					g.resetGame();
//				}
//			}

		}

		// g.paint();
		// topCpn.setMainFrame(this);
		// score.setScore(g.getMyScore());
		// stepMove.setStepMove(g.stepMove);

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
