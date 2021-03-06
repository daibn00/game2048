package Searching.My_Application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import Searching.BinarySearchST;

public class List_Student {
	private BinarySearchST<String,Student> bs;
	
	public List_Student() {
		bs = new BinarySearchST<String,Student>();
	}
	
	public boolean contains_Student(String id) {
		return bs.contains(id);
	}
	
	public Student get_Student(String id) {
		return bs.get(id);
	}
	
	public void add_Student(String id,Student s) {
		bs.put(id, s);
	}
	
	public void delele_Student(String id) {
		bs.delete(id);
	}
	
	public void deleteMax() {
		bs.deleteMax();
	}
	
	public void deleteMin() {
		bs.deleteMin();
	}
	
	public Student max_Mark() {
		double max = Double.MIN_VALUE;
		Student s = new Student();
		for (String id : bs.keys()) {
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
		for (String id : bs.keys()) {
			Student st = this.get_Student(id);
			if (min > st.sumOfMark()) {
				min = st.sumOfMark();
				s = st;
			}	
		}
		return s;
	}
	
	public void print_List_Student() {
		for (String id : bs.keys()) System.out.println(bs.get(id));
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
		System.out.println("Nhap ma sinh vien");
		Scanner sc = new Scanner(System.in);
		String masv = null;
		do {
			masv  = sc.nextLine();
			if(list.get_Student(masv) != null) {
				System.out.println(list.get_Student(masv));
			}else {
				System.out.println("Khong tim thay vui long nhap lai");
			}			
		}while(list.get_Student(masv) == null);
	}
}
