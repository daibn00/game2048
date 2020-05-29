package oop;

public class Packing {    // student
      
      public static void main(String[] args) {
		 Student x = new Student();
		 x.SetName("NguyenVietDai");;
		 System.out.println("Xin chao " + x.getName());
	}
}

class Student{
	private String name;
    
    public String getName() {
  	  return this.name;
    }
    public void SetName(String name) {
  	  this.name = name;
    }
	
}
