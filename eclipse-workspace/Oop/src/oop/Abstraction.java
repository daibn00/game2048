package oop;

//Tinh truu tuong
abstract class Animals{
public void xuat() {
		System.out.println("Hellow");
		}
public abstract void hienThiTiengKeu();
		}

class Dog extends Animals{
	@Override
	public void hienThiTiengKeu() {
		System.out.println("Go Go");
	}

}
class Cat extends Animals{
	@Override
	public void hienThiTiengKeu() {
		System.out.println("MEOW MEOW");
	}

}
public class Abstraction {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.hienThiTiengKeu();
		Cat cat = new Cat();
		cat.hienThiTiengKeu();
	}

}
