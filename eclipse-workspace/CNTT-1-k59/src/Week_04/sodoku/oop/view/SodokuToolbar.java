package sodoku.oop.view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class SodokuToolbar extends JToolBar {
	
	private static final long serialVersionUID = -9070757048527877571L;
	/*
	 * Attributes
	 */
	private JButton btnOpen;
	private JButton btnSave;
	private JButton btnExit;
	private JButton btnHelp;
	
	/*
	 * Constructors
	 */
	public SodokuToolbar(SodokuListener listener){
		super();
		this.setRollover(true);
		this.setFloatable(true);
		/*
		 * Initialization all buttons
		 */
		btnOpen = new JButton(new ImageIcon(this.getClass().
				getResource("../../../images/open.gif")));
		btnOpen.setToolTipText("Open text game file ...");
		
		btnSave = new JButton(new ImageIcon(this.getClass().
				getResource("../../../images/save.gif")));
		btnSave.setToolTipText("Save text game file ...");
		
		btnExit = new JButton(new ImageIcon(this.getClass().
				getResource("../../../images/exit.gif")));
		btnExit.setToolTipText("Exit game ...");
		
		btnHelp = new JButton(new ImageIcon(this.getClass().
				getResource("../../../images/help.gif")));
		btnHelp.setToolTipText("About me ...");
		
		this.add(btnOpen);
		this.addSeparator();
		this.add(btnSave);
		this.addSeparator();
		this.add(btnExit);
		this.addSeparator();
		this.add(btnHelp);
		
		/*
		 * Action listeners
		 */
		btnOpen.addActionListener(listener);
		btnSave.addActionListener(listener);
		btnExit.addActionListener(listener);
		btnHelp.addActionListener(listener);
		
		/*
		 * Initialization
		 */
		this.setEnableToolbar(false);
	}
	
	public void setEnableToolbar(boolean status){
		this.btnOpen.setEnabled(true);
		this.btnSave.setEnabled(status);
		this.btnExit.setEnabled(true);
		this.btnHelp.setEnabled(true);
	}
}
