package Searching.My_Application.BST;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import Searching.BST;




public class List_Student {
private BST<String,Student> bst;
	
	public List_Student() {
		bst = new BST<String,Student>();
	}
	
	public boolean contains_Student(String id) {
		return bst.contains(id);
	}
	
	public Student get_Student(String id) {
		return bst.get(id);
	}
	
	public void add_Student(String id,Student s) {
		bst.put(id, s);
	}
	
	public void delele_Student(String id) {
		bst.delete(id);
	}
	
	public void deleteMax() {
		bst.deleteMax();
	}
	
	public void deleteMin() {
		bst.deleteMin();
	}
	
	public Student max_Mark() {
		double max = Double.MIN_VALUE;
		Student s = new Student();
		for (String id : bst.keys()) {
			Student st = this.get_Student(id);
			if (max < st.sumOfMark()) {
				max = st.sumOfMark();
				s = st;
			}
		}
		return s;
	}
	
	public Student min_Mark() {
		double min = Double.MAX_VALUE;
		Student s = new Student();
		for (String id : bst.keys()) {
			Student st = this.get_Student(id);
			if (min > st.sumOfMark()) {
				min = st.sumOfMark();
				s = st;
			}	
		}
		return s;
	}
	
	public void print_List_Student() {
		for (String id : bst.keys()) System.out.println(bst.get(id));
	}
	
	public static void main(String args[]) {
		
		List_Student list = new List_Student();
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(new File("liststudent.txt"));
			br = new BufferedReader(fr);
			String line = br.readLine();
			while(line != null) {
				String str[] = line.split("-");
				list.add_Student(str[0], new Student(str[0],str[1],Double.parseDouble(str[2]),Double.parseDouble(str[3]),Double.parseDouble(str[4])));
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		list.print_List_Student();
		System.out.println("____________________________________________________");
		System.out.println("Sinh Vien Co Diem Cao Nhat la : "+ list.max_Mark() + "\nVoi Tong Diem: "+list.max_Mark().sumOfMark());
		System.out.println("____________________________________________________");
		System.out.println("Sinh Vien Co Diem Thap Nhat la : "+ list.min_Mark() + "\nVoi Tong Diem: "+list.min_Mark().sumOfMark());
		
		System.out.println("__________________________________________________________________________");
	    System.out.println("Nhap id student muon tim: ");
	    Scanner scanner = new Scanner(System.in);
	    String id = scanner.nextLine();
	    if (list.contains_Student(id)) {
	    	System.out.println("Da Tim Thay!!" + "\n" + list.get_Student(id));
	    }
	    else System.out.println("Khong tim thay sinh vien nao co id la "+ id);
	    scanner.close();
		
	}
}
