package View;



import javax.swing.ImageIcon;
import javax.swing.JFrame;

import Controller.ListenerGame;
import modal.File_Io_bestScore;
import Constant.Constant;



public class Frame2048 extends JFrame {
	public ListenerGame listener  = new ListenerGame();
	public GamePanelCpn mainGame = new GamePanelCpn(listener);
	public Helper helper = new Helper(listener);
	private MenuBar menuBar = new MenuBar(listener);
	

	
	ImageIcon icon;

	public Frame2048() {
		super("Game 2048");
		this.setSize(400, 500);
		this.setLocation(500, 400);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.init();
	}
	public void init() {
	       if(Integer.parseInt(File_Io_bestScore.readScore())==0) {
	    		this.add(helper);
	       }else {
				this.add(mainGame);
	    		this.addMenuBar();
	       }
	    	



		this.setVisible(true);
		icon = new ImageIcon(Constant.ICON_IMAGES);
        this.setIconImage(icon.getImage());     
		listener.setMain(this);
		
	}
	
	public void addMenuBar() {
		this.setJMenuBar(menuBar);

	}

	
	public static void main(String[] args) {
		Frame2048 g = new Frame2048();
		g.setVisible(true);
	}
	

}
