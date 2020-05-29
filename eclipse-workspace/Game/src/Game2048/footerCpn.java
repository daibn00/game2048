//package Game2048;
//
//import java.awt.BorderLayout;
//import java.awt.GridLayout;
//
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//
//public class footerCpn extends JPanel {
//	private JLabel stepMove;
//	private JLabel title;
//	private JLabel copyRight;
//	private JPanel topFooter;
//
//	public footerCpn() {
//		topFooter = new JPanel();
//		stepMove = new JLabel(0 + " move", JLabel.CENTER);
//		title = new JLabel(" PRESS ESC TO RESTART GAME ", JLabel.CENTER);
//		copyRight = new JLabel("\u00a9" + "  by trên mạng ", JLabel.CENTER);
//		BorderLayout borderLayout = new BorderLayout();
//		borderLayout.setVgap(10);
//		this.setLayout(borderLayout);
//		topFooter.setLayout(new GridLayout(1, 2));
//		topFooter.add(stepMove);
//		topFooter.add(title);
//		this.add(topFooter, BorderLayout.NORTH);
//		this.add(copyRight, BorderLayout.SOUTH);
//
//	}
//
//	public void setStepMove(int num) {
//		topFooter.remove(stepMove);
//		topFooter.revalidate();
//		stepMove = new JLabel(num + " move", JLabel.CENTER);
//		topFooter.add(stepMove);
//		topFooter.add(title);
//	}
//}
