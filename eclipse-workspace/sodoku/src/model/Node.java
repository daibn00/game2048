package model;

import utils.Constants;

public class Node {
	// Attributes
	private int row;   // from 0..8
	private int col;   // from 0..8
	private int zone;  // from 0..8
	private int value; // from 0..9 - 0: default - not has value.
	private boolean isReserved;
	
	// Constructors
	public Node(int row, int col, int value, boolean isReserved) {
		this.row = row;
		this.col = col;
		this.value = value;
		this.isReserved = isReserved;
		this.zone = this.calculate_zone();
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int getZone() {
		return zone;
	}

	public void setZone(int zone) {
		this.zone = zone;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isReserved() {
		return isReserved;
	}

	public void setReserved(boolean isReserved) {
		this.isReserved = isReserved;
	}

	@Override
	public String toString() {
		return "Node [row=" + row + ", col=" + col + ", zone=" + zone + ", value=" + value + ", isReserved="
				+ isReserved + "]";
	}
	
	// Others methods
	private int calculate_zone(){
		int r = this.row / Constants.ZONE_SIZE;
		int c = this.col / Constants.ZONE_SIZE;
		int zone = r * Constants.ZONE_SIZE + c;
		return zone;
	}
	
	public boolean isReserved(Game game){
		Node node = game.getNode(row, col);
		return node.isReserved;
	}
	
	public boolean isValidateByRow(Game game){
		for (int j = 0; j < Constants.GAME_SIZE; j++) {				
			if (game.getNode(this.row, j).getValue() == this.value){
				return false;
			}
		}
		return true;
	}
	
	public boolean isValidateByCol(Game game){
		for (int i = 0; i < Constants.GAME_SIZE; i++) {
			if (game.getNode(i, this.col).getValue() == this.value){
				return false;
			}
		}
		return true;
	}
	
	public boolean isValidateByZone(Game game){
		for (int i = 0; i < Constants.GAME_SIZE; i++) {
			for (int j = 0; j < Constants.GAME_SIZE; j++) {
				if (game.getNode(i, j).zone == this.zone){
					if (game.getNode(i, j).getValue() == this.value){
						return false;
					}
				}
			}
		}
		return true;
	}
}
