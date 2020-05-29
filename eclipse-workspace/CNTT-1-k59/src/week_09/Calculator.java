package week_09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Calculator extends JFrame implements ActionListener, KeyListener {
	
    private JTextField Firsttxt;
    private JTextField Secondtxt ;
    private JTextField Resutl ;
	public Calculator() {
		super("Calcultor");
		this.setLocation(500, 500);
		this.setSize(400, 200);
		this.setResizable(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.init();
	}

	public void init() {

		JPanel mainPanel = new JPanel();
		JPanel centerPanel = new JPanel();
		JPanel southPanel = new JPanel();

		mainPanel.setLayout(new BorderLayout());
		centerPanel.setLayout(new GridLayout(3, 2));
		mainPanel.add(centerPanel, BorderLayout.CENTER);
		mainPanel.add(southPanel, BorderLayout.SOUTH);

		JLabel firstLbl = new JLabel("First number");
		JLabel secondLbl = new JLabel("Second number");
		JLabel resutlLbl = new JLabel("Result");
		 Firsttxt = new JTextField("");
		 Secondtxt = new JTextField("");
		 Resutl = new JTextField("");
		JButton addBtn = new JButton("+");
		JButton subBtn = new JButton("-");
		JButton mulBtn = new JButton("x");
		JButton divBtn = new JButton("/");

		centerPanel.add(firstLbl);
		centerPanel.add(Firsttxt);
		centerPanel.add(secondLbl);
		centerPanel.add(Secondtxt);
		centerPanel.add(resutlLbl);

		southPanel.add(addBtn);
		southPanel.add(subBtn);
		southPanel.add(mulBtn);
		southPanel.add(divBtn);
		centerPanel.add(Resutl);

		Resutl.setEditable(false);
		Resutl.setBackground(Color.YELLOW);

		this.setContentPane(mainPanel);
		// this.setJMenuBar(myMenu);

		// Listener registration
		addBtn.addActionListener(this);
		subBtn.addActionListener(this);
		mulBtn.addActionListener(this);
		divBtn.addActionListener(this);
		Firsttxt.addKeyListener(this);
		//mainPanel.setFocusable(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//System.out.println(e.getSource());
		// e.getActionCommand();
		double fvalue = 0;
		double svalue = 0;
		try {
			 fvalue = Double.parseDouble(Firsttxt.getText()) ;
			svalue = Double.parseDouble(Secondtxt.getText()) ;
		}catch(NumberFormatException err) {
			JOptionPane.showMessageDialog(this, "Number format","Error" ,JOptionPane.ERROR_MESSAGE);
		}
		
		
		String cmd = e.getActionCommand();
		if ("+".equals(cmd)) {
			
			Resutl.setText("" +(fvalue + svalue));
		}
		if ("-".equals(cmd)) {
			Resutl.setText("" +(fvalue - svalue));
		}
		if ("x".equals(cmd)) {
			Resutl.setText("" +(fvalue * svalue));
		}
		if ("/".equals(cmd)) {
			Resutl.setText("" +(fvalue / svalue));
		}
	    
		JButton source = (JButton)e.getSource();
		System.out.println(source.getText());
		
		

	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
