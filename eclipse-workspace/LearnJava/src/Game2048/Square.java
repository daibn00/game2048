package Game2048;

public class Square {
	private static Square data = new Square();
	
	public Square getData() {
		return this.data;
	}
	public int[][] arr = new int[4][4];

}
