package practice;


import java.util.*;
public class BaiTapSet {
	public static void main(String[] args) {
		Set<String> setString = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n :");
		
		
		int n =  Integer.parseInt(sc.nextLine()); //Integer.parseInt (chuyen String ve so)
		System.out.print("Nhap Ten Khoa : \n");


		for(int i=0;i<n;i++) {
			String name = sc.nextLine();
			setString.add(name);
		
		}
		Iterator<String> nameFaculty = setString.iterator();
	    System.out.println("Ten cac khoa vua nhap la : ");
	   while(nameFaculty.hasNext()) {
		   System.out.println(nameFaculty.next());
	   }
	   System.out.print("Nhap ten khoa can them");
	   String t = sc.nextLine();
	   if(!setString.contains(t)) {
		   setString.add(t);
		   System.out.println("Them thanh cong");
	   }
	   else System.out.println("Ten khoa da co trong Set");
	   System.out.println("NHap ten khoa can xoa");
	   String u = sc.nextLine();
	   if(setString.contains(u)) {
		   setString.remove(u);
		   System.out.println("Xoa thanh cong");
	   }
	   else System.out.println("Xoa khong thanh cong vi trong xet khong co u");
		sc.close();
	}
      
}
