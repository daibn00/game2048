package oop;

class Employee{
	float salary = 1000;
}

class Program extends Employee{
	 int bonus = 150;
	 private int a[][];
	 Program(int x[][]){
		 this.a = x;
	 }
	 public void nhap() {
		 
	 };
}

public class KeThua {
	public static void main(String[] args) {
		Program p = new Program(new int[][]
				{
            {3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}
		});
		System.out.println("Luong : " + p.salary);
		System.out.println("Thuong : "+p.bonus);
	}

}
