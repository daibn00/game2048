import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListInterface {
	public static void main(String[] args) {
		// khai bao List Interface ten listString cos kieu la String
		//va su dung class ArrayList de trien khai
		//ArrayList la 1 class collection 
		// va cac phan tu trong listString cung la kieu String
		List<String> listString = new ArrayList<String>();
		
		// tuong tu nhu dung vs arraylist

		// khai bao khi biet so luong phan tu la 1000
//		List<Integer> listInteger = new ArrayList<>(1000);
//		
//		//them cac phan tu
//		listInteger.add(3);
//		listInteger.add(5);
//		listInteger.add(4);
//		listInteger.add(1, 20);
//		// cach 1
//		for(String element : listInteger) {
//			System.out.println(element);
//		}
//		//cach 2
//		for(int i =0;i<listInteger.size();i++) {
//			System.out.println(listInteger.get(i));
//		}
//		// cach 3 su dung Iterator
//		Iterator<String> iterator = null;
//		iterator = listInteger.iterator();
//		System.out.println("\n\n\n\n\n");
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		ListIterator<Integer> itr = null;
//		itr = listInteger.listIterator();
//		while(itr.hasNext()) {
//			System.out.println(" "+itr.next());
//		}
//		 while (itr.hasPrevious()) {  
//             System.out.println(""+itr.previous());  
//      }  
//		 for(int i : listInteger) {
//			 System.out.println(i);
//		 }
		
		
		//addAll(ten List) gop 2 List lai voi nhau nhung phai cung kieu du lieu
		//addAll(vitri can chen,ten List) 
		List<String> listString1 = new ArrayList<String>();
		listString1.add("One");
		listString1.add("Two");
		listString1.add("Three");
		List<String> listWord  = new ArrayList<String>();
		listWord.add("four");
		listWord.add("Five");
		listWord.add("Six");
		listWord.add("four");
		listWord.add("Five");
		System.out.println(listWord);
	
//		for(String i : listString1) {
//			System.out.println(i);
//		}
//		listString1.addAll(3,listWord);
//		System.out.println("Then");
//		for(String i : listString1) {
//			System.out.println(i);
//		}
//		
//		//phuong thuc get(index) : lay phan tu tai vi tri
//		String a = listString1.get(3);
//		System.out.println("\n\n\n"+a);
//		
//		//set(index,phan tu thay the) thiet lap phan tu
//		listString1.set(1, "100");
////		for(String i : listString1) {
////			System.out.println(i);
////		}
//        // remove co 2 cach
//		// xoa dua vao chi so phan tu remove(index)
//		
//		
////		listString1.remove(1);
////		for(String i : listString1) {
////			System.out.println(i);
////		}z`
//		// xoa truc tiep 1 phan tu remove(ten phan tu muon xoa)
//		listString1.remove("One");
//		for(String i : listString1) {
//			System.out.println(i);
//		}
//		
//		//search phan tu dung contains: boolean
//		if(!listString1.contains("sdf")) {
//			System.out.println("Khong co");
//		}
//		else System.out.println("co");
//		
//		//search dung indexOf de tra ve tri tri : int nguoc laivoi lasIndexOf
//		int firstSearch = listString1.indexOf("Six");
//		System.out.println("vi tri can tim cua phan tu la :"+ firstSearch);
//		//ham sap xep cac phan tu
//		Collections.sort(listString1);
//		for(String i : listString1) {
//			System.out.println(i);
//		}
//		
//		//ham copy Collections.copy(danh_sach_dich,danh_sach_nguon)
//		
//		Collections.copy(listWord, listString1);
//		for(String i : listWord) {
//			System.out.println(i);
//		}
		Integer[] a = {3,1,2,3,1};
		
		List<Integer> listInt =  Arrays.asList(a);
		for(int b : listInt) {
			System.out.println(b);
		}
		Object[] c = listInt.toArray();
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		
		
		
	}
      
}
