package Sorting.Application.MinPQ;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import Searching.My_Application.BST.Student;
import edu.princeton.cs.algs4.MinPQ;


public class PQ_Student {
    private MinPQ<Student> pq;
	public PQ_Student() {
		pq = new MinPQ<Student>(10,(Student s1,Student s2)->
		s1.sumOfMark() < s2.sumOfMark()?-1 : s1.sumOfMark() == s2.sumOfMark()? 0:1);
	}
	
	public MinPQ<Student> top_Ten(){
		MinPQ<Student> top_Ten = new MinPQ<Student>(11,(Student s1,Student s2)->
		s1.sumOfMark() < s2.sumOfMark()?-1 : s1.sumOfMark() == s2.sumOfMark()? 0:1);
		if (pq.size() <= 10) return pq;
		else {
			for (Student st : pq) {
				top_Ten.insert(st);
				if (top_Ten.size() == 10) top_Ten.delMin();
			}
		}
		return top_Ten;
	}
	
	public void insert_Student(Student s) {
		pq.insert(s);
	}
	
	public MinPQ<Student> getPQ_student(){
		return pq;
	}
	public static void main(String args[]) {
		PQ_Student pqs = new PQ_Student();
		
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(new File("liststudent.txt"));
			br = new BufferedReader(fr);
			String line = br.readLine();
			while(line != null) {
				String str[] = line.split("-");
				pqs.insert_Student( new Student(str[0],str[1],Double.parseDouble(str[2]),Double.parseDouble(str[3]),Double.parseDouble(str[4])));
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		MinPQ<Student> top_Ten = pqs.top_Ten();
		pqs.getPQ_student().forEach(s -> System.out.println(s+"--->>>>>>"+s.sumOfMark()));
		System.out.println("________________________________________________________________");
		System.out.println("Top 10 sinh vien co diem cao nhat: ");
		top_Ten.forEach(s -> System.out.println(s+"->>>>>"+s.sumOfMark()));
	}
}
