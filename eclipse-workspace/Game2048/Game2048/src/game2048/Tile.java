package game2048;

import java.awt.Color;

public  class Tile {
	 int value;

	public Tile() {
		this.value = 0;
	}

	public Tile(int num) {
		value = num;
	}
	public void setValue(int num) {
		value = num;
	}

	public boolean isEmpty() {
		return value == 0;
	}

	public Color getForeground() {
		return value < 16 ? new Color(83,83,83) : new Color(255,255,255);
	}

	public Color getBackground() {
		switch (value) {
		case 2:
			return new Color(238, 228, 218);
		case 4:
			return new Color(236, 224, 200);
		case 8:
			return new Color(242, 177, 121);
		case 16:
			return new Color(245, 149, 99);
		case 32:
			return new Color(245, 124, 95);
		case 64:
			return new Color(246, 88, 66);
		case 128:
			return new Color(237, 206, 114);
		case 256:
			return new Color(237, 204, 97);
		case 512:
			return new Color(231, 196, 80);
		case 1024:
			return new Color(235, 194, 68);
		case 2048:
			return new Color(231, 189, 45);
		}
		return new Color(0xcdc1b4);
	}
}
