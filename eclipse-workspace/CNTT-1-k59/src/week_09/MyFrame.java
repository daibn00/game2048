package week_09;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class MyFrame extends JFrame {
	
	
	public MyFrame() {
		super("Exemple ");
		//set vi tri cua ung dung tren man hinh
		setLocation(100, 100);
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//set change kich thuoc giao dien
		setResizable(true);
		
		//setSize kich thuoc
		setSize(500, 500);
		
		
		JPanel mainPanel = new JPanel();
		this.setContentPane(mainPanel);
		mainPanel.setBorder(BorderFactory.createTitledBorder("panel"));
		JLabel lable = new JLabel("Jbale");
		JTextField tf = new JTextField("Type here ...");
		JLabel label2 = new JLabel(" Button");
		JLabel label3 = new JLabel(" Button");
		
		mainPanel.setLayout(new BorderLayout());
		
		JButton bt1 = new JButton("1");
		JButton bt2 = new JButton("2");
		JButton bt3 = new JButton("3");
		JButton bt4 = new JButton("4");
		JButton bt5 = new JButton("5");
		JButton bt6 = new JButton("6");
		JButton bt7 = new JButton("7");
		JButton bt8 = new JButton("8");
		JButton bt9 = new JButton("9");
		mainPanel.add(bt1, BorderLayout.WEST);
		mainPanel.add(bt2,BorderLayout.EAST);
		mainPanel.add(bt3, BorderLayout.SOUTH);
		mainPanel.add(bt4,BorderLayout.NORTH);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new BorderLayout());
		
		mainPanel.add(centerPanel,BorderLayout.CENTER);
		centerPanel.add(bt5,BorderLayout.CENTER);
		centerPanel.add(bt6, BorderLayout.WEST);
		centerPanel.add(bt7,BorderLayout.EAST);
		centerPanel.add(bt8, BorderLayout.SOUTH);
		centerPanel.add(bt9,BorderLayout.NORTH);

		
		
		setVisible(true);
	}

}
