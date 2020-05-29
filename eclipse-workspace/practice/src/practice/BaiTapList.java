package practice;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class BaiTapList {
	   public static void main(String[] args) {
		List<String> listString1 = new ArrayList<String>();
		listString1.add("1");
		listString1.add("2");
		listString1.add("3");
		listString1.add("4");
		listString1.add("5");
		listString1.add("6");
		listString1.add("7");
		
		// khai bao iterator
		
		Iterator<String> str = null;
		str = listString1.iterator();
		// xuat bang iteator
		while(str.hasNext()) {
			System.out.println(" "+str.next());
		}
		System.out.println("\n\n\n");
		// khai bao listiterator
		ListIterator<String> str1 = listString1.listIterator();
		while(str1.hasNext()) {
			System.out.println(" "+str1.next());
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap phan tu can them : ");
		String n = sc.nextLine();
		int b = sc.nextInt();
		
		listString1.set(b, n);
		System.out.println("\n Sau khi thay doi la :");
		for(String str2 : listString1) {
			System.out.println(str2);
		}
		// xoa phan tu
		listString1.remove(b);
		System.out.println("Sau khi xoa la :");
		for(String str2 : listString1) {
			System.out.println(str2);
		}
		sc.close();
		
		System.out.println("\n\n Danh sach la :");
		for(int i = listString1.size()-1;i>=0;i--) {
			System.out.println(listString1.get(i));
		}
		
		
	}
      
}
