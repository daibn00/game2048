import javax.swing.JFrame;


public class JframeSwing {
	
	public JframeSwing() {
		JFrame frame = new JFrame("Hello");
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
	}
	public static void main(String[] args) {
		new JframeSwing();
	}

}
