package sodoku.oop.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import sodoku.oop.model.Game;
import sodoku.oop.model.Node;
import sodoku.oop.utils.Constants;
import sodoku.oop.utils.MyException;

public class SodokuListener implements ActionListener, MouseListener {

	private SodokuFrame mainFrame;
	private SodokuLabel selectedLbl = null;
	private boolean isStart = false;

	public void setMainFrame(SodokuFrame mainFrame) {
		this.mainFrame = mainFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			String command = e.getActionCommand();
			if ("Exit".equalsIgnoreCase(command)) {
				System.exit(0);
			} else {
				JButton btn = (JButton) e.getSource();
				if (this.isStart && this.selectedLbl != null) {
					int value = Integer.parseInt(btn.getText());
					Node sNode = this.selectedLbl.getNode();
					Node node = new Node(sNode.getRow(), sNode.getCol(), value, false);
					Game game = this.mainFrame.mainPanel.getGame();
					try {
						game.validates_game(node);
						sNode.setValue(value);
						this.selectedLbl.setText("" + value);
					} catch (MyException ex) {
						JOptionPane.showMessageDialog(this.mainFrame, ex.getMessage(), "Error",
								JOptionPane.ERROR_MESSAGE);
					}
					if (!game.isNotEndGame()) {
						JOptionPane.showMessageDialog(this.mainFrame, "Conglatulation, you won the game", "Winner ...",
								JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		} else {
			String command = e.getActionCommand();
			if ("Exit".equalsIgnoreCase(command)) {
				System.exit(0);
			}
			if ("Open".equalsIgnoreCase(command)) {
				/*
				 * Selected file dialog
				 */
				JFileChooser chooser = new JFileChooser("E:\\");
				SodokuFileFilter filter = new SodokuFileFilter("txt", "Text file selected");
				chooser.setFileFilter(filter);
				int returnVal = chooser.showOpenDialog(mainFrame);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					/*
					 * Read data into game
					 */
					String fileName = chooser.getSelectedFile().getPath();
					try {
						this.mainFrame.mainPanel.getGame().readData(fileName);
						this.selectedLbl = null;
						this.isStart = true;
						this.mainFrame.mainPanel.refreshGame();
						this.mainFrame.mainMenu.setEnableMenu(true);
					} catch (MyException ex) {
						JOptionPane.showMessageDialog(this.mainFrame, "Error: can not read data from file!", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
			if ("Save".equalsIgnoreCase(command)) {
				/*
				 * Selected file dialog
				 */
				JFileChooser chooser = new JFileChooser("E:\\");
				SodokuFileFilter filter = new SodokuFileFilter("txt", "Text file selected");
				chooser.setFileFilter(filter);
				int returnVal = chooser.showSaveDialog(mainFrame);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					/*
					 * Write data into file
					 */
					String fileName = chooser.getSelectedFile().getName();
					String path = chooser.getCurrentDirectory().getPath();
					String filePath = path + Constants.updateFileName(fileName);
					try {
						this.mainFrame.mainPanel.getGame().saveData(filePath);
					} catch (MyException ex) {
						JOptionPane.showMessageDialog(this.mainFrame, "Error: can not write data to file!", "Error",
								JOptionPane.ERROR_MESSAGE);
					}

				}
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() instanceof SodokuLabel) {
			if (this.isStart) {
				SodokuLabel lbl = (SodokuLabel) e.getSource();
				if (this.selectedLbl != null) {
					this.selectedLbl.setSelected(false);
					this.selectedLbl.setBackground();
				}
				lbl.setSelected(true);
				this.selectedLbl = lbl;
				this.selectedLbl.setBackground();
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

}
