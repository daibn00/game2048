
import java.util.*;
import java.util.stream.Collectors;



public class SetInterFace {
	public static void main(String[] args) {
		// cac phan tu trong Set Khong duoc Giong nhau len khi gap phan tu giong nhau no se xoa di
		
//		
//		// khai bao Set Interface la hashsetInteger
//		//  va su dung class HashSet de trien khai
//		// HashSet la 1 class collection
//		//cac phan t6u trong hashsetInteger co cung kieu la integer
//		Set<Integer> hashsetInteger = new HashSet<>();
//		hashsetInteger.add(41);
//	    hashsetInteger.add(1);
//	    hashsetInteger.add(0);
//	    hashsetInteger.add(8);
//	    hashsetInteger.add(1);
//	    hashsetInteger.add(2);
//	    hashsetInteger.add(10);
//	    
//	 
//	 // khai bao Set Interface la treesetInteger
//	 		//  va su dung class TreeSet de trien khai
//	 		// TreeSet la 1 class collection
//	 		//cac phan t6u trong hashsetInteger co cung kieu la integer
//	    Set<Integer>> treesetInteger = new TreeSet<>(hashsetInteger);
//	    treesetInteger.add(41);
//	    treesetInteger.add(1);
//	    treesetInteger.add(0);
//	    treesetInteger.add(8);
//	    treesetInteger.add(1);
//	    treesetInteger.add(2);
//	    treesetInteger.add(10);   
//	    
//	    Scanner sc = new Scanner(System.in);
//	    System.out.println(treesetInteger);
//	    int number = sc.nextInt();
//	    
//	    if(treesetInteger.contains(number)) {
//	    	treesetInteger.remove(number);
//	    	System.out.println("xoa thanh cong");
//	    	System.out.println(treesetInteger);
//	    }
//	    else System.out.println("Xoa khong thanh cong vi khong ton tai");
//	    // xoa tat ca ca phan tu trong set ta dung cleat 
//	    treesetInteger.clear();
//	    System.out.println(treesetInteger);
		
		
		Integer[] b = {19,12};
		
		// su dung phuong thuc Arrays.asList() trong List
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(18);
		list1.add(12);
		list1.add(10);
		List<Integer> list2 = Arrays.asList(b);
		list1.stream().filter(number -> number%2==0).forEach(System.out::println);
		//Chuyen List vao set
		Set<Integer> setInteger1 = new HashSet<>(list1);
		Set<Integer> setInteger2 = new HashSet<>(list2);
		
		
		if(setInteger1.containsAll(setInteger2)) {
			System.out.println("setInteger2 la con thang 1");
		}
		else System.out.println("setInteger2 ko la con thang 1");
		
		
		// addAll : thuc hien phep toan gop laiu voi nhau
		
		System.out.println(list1);
		setInteger1.addAll(setInteger2);
		System.out.println(setInteger1);

        Object[] arr = list1.toArray();
	     
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	    


	    
	    
       
	}
       
}
