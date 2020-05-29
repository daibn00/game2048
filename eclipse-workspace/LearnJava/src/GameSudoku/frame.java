package GameSudoku;

import javax.swing.JFrame;

public class frame extends JFrame {
	
	public frame() {
		super("SUDOKU");
		this.setSize(500, 500);
		this.setLocation(400, 400);
		this.setResizable(false);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		frame frame = new frame();
		frame.setVisible(true);
		
	}

}
