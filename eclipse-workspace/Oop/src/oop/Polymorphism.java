package oop;

// Tinh da hinh
class HCN{
	public void show() {
		System.out.println("Day la phuong thuc Show() cua HCN");
	}
}

class Rectangle extends HCN{
		public void show() {
			System.out.println("Day la phuong thuc Show() cua Rec");
		}
}

class Square extends HCN{
	public void show() {
		System.out.println("Day la phuong thuc Show() cua Squa");
	}
}


public class Polymorphism {
	public static void main(String[] args) {
		HCN hcn = new HCN();
		hcn.show();
		
		hcn = new Rectangle();
		hcn.show();
		hcn = new Square();
		hcn.show();
		
		
	}
}
