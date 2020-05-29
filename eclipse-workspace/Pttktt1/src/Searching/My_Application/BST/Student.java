package Searching.My_Application.BST;

public class Student {
	private String id;
	private String name;
	private double math_mark;
	private double physics_mark;
	private double chemistry_mark;
	
	/*
	 * Constructor
	 */
	public Student() {};
	public Student(String id,String name,double math_mark,double physics_mark,double chemistry_mark) {
		this.id = id;
		this.name = name;
		this.math_mark = math_mark;
		this.physics_mark = physics_mark;
		this.chemistry_mark = chemistry_mark;
	}
	/*
	 * Getters and Setters
	 */
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMath_mark() {
		return math_mark;
	}
	public void setMath_mark(double math_mark) {
		this.math_mark = math_mark;
	}
	public double getPhysics_mark() {
		return physics_mark;
	}
	public void setPhysics_mark(double physics_mark) {
		this.physics_mark = physics_mark;
	}
	public double getChemistry_mark() {
		return chemistry_mark;
	}
	public void setChemistry_mark(double chemistry_mark) {
		this.chemistry_mark = chemistry_mark;
	}
	
	/*
	 * Other methods
	 */
	
	public double sumOfMark() {
		return Double.parseDouble(String.format("%.2f", this.math_mark + this.physics_mark + this.chemistry_mark));
	}
	
	
	public double averageOfMark() {
		return sumOfMark()/3;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", math_mark=" + math_mark + ", physics_mark=" + physics_mark
				+ ", chemistry_mark=" + chemistry_mark + "]";
	}
	
}
