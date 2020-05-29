
import java.util.SortedSet;
import java.util.List;
import java.util.ArrayList;
import java.util.TreeSet;
public class sortedSet {
	
	public static void main(String[] args) {
		
		List<Integer> listInteger = new ArrayList<>();
		listInteger.add(2);
	    listInteger.add(1);
	    listInteger.add(4);
	    listInteger.add(3);
	    listInteger.add(6);
	    listInteger.add(5);
	    listInteger.add(8);
	    listInteger.add(7);
	    listInteger.add(0);
	    listInteger.add(9);
	    // khai bao SortedSet co cac phan tu cua listInteger
	    // TreeSet da duoc sap xep tang dan
	    SortedSet<Integer> sortedSetInteger = new TreeSet<>(listInteger);
	    System.out.println("Cac phan tu cua sortedSet");
	    System.out.println(sortedSetInteger);
	    // khai báo 1 SortedSet có tên là subset
	    // có các phần tử được trích xuất 
	    // trong đoạn [3,7) của sortedsetInteger
	    //subSet tra ve SortedSet ttheo 1 doan vi tri cho truoc
	    SortedSet<Integer> subset = sortedSetInteger.subSet(3, 7);
	    System.out.println(subset);
	    
	    // headset tra ve SortedSet tu phan tu dau den toElement
	    System.out.println(sortedSetInteger.headSet(3));
	    // ham first() : tra ve phan tu nho nhat , last() : tra ve phan tu lon nhat
	    
	    System.out.println("Phan tu nho nhat : " +sortedSetInteger.first() + "\n" + "Phan tu lon nhat la : " + sortedSetInteger.last());
	}

}
