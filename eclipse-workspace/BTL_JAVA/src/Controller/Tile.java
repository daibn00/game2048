package Controller;


import java.awt.Color;

public class Tile {
	
	 private int value = 0;
	 
	 public Tile() {
		 value = 0;
	 }
	 
	 public Tile(int num) {
		 value = num;
	 }

	public  int getValue() {
		return value;
	}

	public  void setValue(int value) {
		this.value = value;
	}
	
    public Color getForeground() {
    	return this.value < 16 ? new Color(83,83,83) : new Color(255,255,255);
    }
    
    public boolean isEmpty() {
    	return value == 0;
    }
	
    public Color getBackground() {
		switch (value) {
		case 2:
			return new Color(0xFEEBD0);
		case 4:
			return new Color(0xC8E2B1);
		case 8:
			return new Color(0x94AAD6);
		case 16:
			return new Color(0xF3C246);
		case 32:
			return new Color(0x83C75D);
		case 64:
			return new Color(0x00B2BF);
		case 128:
			return new Color(0xF19373);
		case 256:
			return new Color(0xFF83FA);
		case 512:
			return new Color(0x00FFFF);
		case 1024:
			return new Color(0x7FFF00);
		case 2048:
			return new Color(0xFF00FF);
		}
		return new Color(0xCDC9C9);
	}

}
