package week_10;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Caculator extends JPanel{
	JTextField textFlf = new JTextField("0");
	
	private String[] array = {"CE","C","<<",""};

	public Caculator() {
		this.init();
	}
	
	private void init() {
		JPanel mainPanel = new JPanel();
		JPanel botPanel = new JPanel();
		
		mainPanel.setLayout(new BorderLayout());
		botPanel.setLayout(new GridLayout(5,4,1,1));
		mainPanel.add(botPanel, BorderLayout.CENTER);
		mainPanel.add(textFlf, BorderLayout.NORTH);
		
		this.add(mainPanel);
		
		
	}

}
