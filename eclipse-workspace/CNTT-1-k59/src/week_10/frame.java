package week_10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class frame extends JFrame implements ActionListener{
	JTextField textFlf = new JTextField("0");
	Font textFont = new Font("Courrier", Font.BOLD, 32);
	Font textFont1 = new Font("Courrier", Font.BOLD, 20);
	Border lineborder = BorderFactory.createLineBorder(Color.black);
	JButton[] btn = { new JButton("CE"), new JButton("C"), new JButton("DEL"), new JButton("/"), new JButton("7"),
			new JButton("8"), new JButton("9"), new JButton("*"), new JButton("4"), new JButton("5"), new JButton("6"),
			new JButton("-"), new JButton("1"), new JButton("2"), new JButton("3"), new JButton("+"),
			new JButton("+/-"), new JButton("0"), new JButton("."), new JButton("="), };
	private double firstNumber = 0;
	private double secondNumber= 0;
	private int operation = 0;
	public frame() {

//	   URL iconURl = this.getClass().getResource("https://icons.iconarchive.com/icons/paomedia/small-n-flat/512/calculator-icon.png");
//	   this.setIconImage(new ImageIcon(iconURl).getImage());

		this.setSize(400, 500);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocation(600, 300);
		this.init();
		this.setVisible(true);
	}

	private void init() {
		JPanel mainPanel = new JPanel();
		JPanel centerPanel = new JPanel();
		
		textFlf.setBackground(mainPanel.getBackground());
		textFlf.setFont(textFont);
		textFlf.setBorder(new EmptyBorder(5,5,5,5));
		textFlf.setHorizontalAlignment(JTextField.RIGHT);
		textFlf.setEditable(false);
		
		for(JButton jbutton : btn) {
			jbutton.setFont(textFont1);
			jbutton.setBorder(lineborder);
			jbutton.addActionListener(this);
			centerPanel.add(jbutton);
			
			
			
		}
		mainPanel.setLayout(new BorderLayout());
		centerPanel.setLayout(new GridLayout(5, 4, 5, 5));
		mainPanel.add(centerPanel, BorderLayout.CENTER);
		mainPanel.add(textFlf, BorderLayout.NORTH);

		this.setContentPane(mainPanel);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		
		if("C".equals(cmd)) {
			textFlf.setText("");
			this.operation = 0;
			firstNumber = 0;
			secondNumber = 0;
		}
		if("DEL".equals(cmd)) {
			String cmd1 = textFlf.getText();
			System.out.println(cmd1.split(""));
			
			
			
			
		}
		if("+".equals(cmd)) {
			textFlf.setText("");
			operation = 1;
			
		}
		if("-".equals(cmd)) {
			textFlf.setText("");
			operation = 2;
			
		}
		if("*".equals(cmd)) {
			textFlf.setText("");
			operation = 3;
			
		}
		if("/".equals(cmd)) {
			textFlf.setText("");
			
			operation = 4;
			
		}
		
		
		if(cmd == "1" || cmd == "2" || cmd == "3"  ||  cmd == "4" || cmd == "5" || cmd == "6" || cmd == "7" ||cmd == "8" ||cmd == "9" || cmd=="0") {

			 if("0".equals(textFlf.getText())) {
				 textFlf.setText(cmd);
			 }
			 else {
				 textFlf.setText(textFlf.getText() + cmd);
				 
			 }
			 if(firstNumber == 0 || secondNumber != 0) {
				
					 this.firstNumber = Double.parseDouble(textFlf.getText());
				
			 }else if(secondNumber == 0 || firstNumber !=0) {
				
				
					 this.secondNumber = Double.parseDouble(textFlf.getText());
					 System.out.println(secondNumber);
				 }
			 }
			
		
		
		
		
		if("=".equals(cmd) && operation != 0) {
			System.out.println(firstNumber + "" + secondNumber);
				double result = 0;
				switch(operation) {
				case 1 :
					result = firstNumber  + secondNumber;
					System.out.println(1);
					
					break;
				case 2 :
					result = firstNumber  - secondNumber;
					System.out.println(2);
					break;
				case 3 :
					result = firstNumber  * secondNumber;
					System.out.println(3);
					break;
				case 4 :
					result = firstNumber  / secondNumber;
					System.out.println(4);
					break;
				}
				textFlf.setText(result  +"");
				operation = 0;
				firstNumber=result;
				secondNumber = 0;
			
		}
		
		
		
	}
}
