package View;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


import javax.swing.JPanel;

import Controller.Broad;
import Controller.ListenerGame;

public class GamePanelCpn extends JPanel {
	public ListenerGame listener = new ListenerGame();
	public CenterCpn centerPanel = new CenterCpn();
	public SouthCpn southPanel = new SouthCpn();
	public NorthCpn nouthPanel = new NorthCpn(listener);

	public GamePanelCpn(ListenerGame listener) {
		this.listener = listener;
		nouthPanel = new NorthCpn(listener);
		this.setFocusable(true);
		this.addKeyListener(listener);
		this.init();

	}
	
	public void setListener(ListenerGame listener) {
		this.listener = listener;
	}

	public void init() {
		BorderLayout borderLayout = new BorderLayout();
		this.setLayout(borderLayout);
		borderLayout.setVgap(30);
		this.add(nouthPanel, borderLayout.NORTH);
		this.add(centerPanel, borderLayout.CENTER);
		this.add(southPanel, borderLayout.SOUTH);
	}

	

}
