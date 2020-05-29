import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

// Map la 1 tap hop cac khoa- gia tri ( key - value)
// Gia tri cua Map co the giong nhau , Nhung khoa thi khong duoc giong nhau
// vi vay ta phai khai bao 1 Set co cac phan tu la cac khoa cua Map
// Co 3 cach trien khai Map la dung Class : HashMap , LinkedMap,TreeMap

public class MapInterFace {
	public static void main(String[] args) {
		
		// trien khap Map co ten hashMap va su dung class HashMap de trien khai
		// Moi phan tu trong hashMap chua 1 key va 1 value
		Map<Integer, String> hashMap = new HashMap<>();
		    hashMap.put(1, "One");
		    hashMap.put(0, "Zero");
		    hashMap.put(2, "Two");
		    hashMap.put(4, "Four");
		    hashMap.put(21, "Twenty first");
		    hashMap.put(5, "Five");
		 // trien khap Map co ten linkedHashMap va su dung class LinkedHashMap de trien khai
			// Moi phan tu trong hashMap chua 1 key va 1 value
		  Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
		  linkedHashMap.put(1, "One");
		    linkedHashMap.put(0, "Zero");
		    linkedHashMap.put(2, "Two");
		    linkedHashMap.put(4, "Four");
		    linkedHashMap.put(21, "Twenty first");
		    linkedHashMap.put(5, "Five");
		 
		  
		    // khai báo Map Interface tên treeMap
		    // và sử dụng Class là TreeMap để triển khai
		    // TreeMap là 1 Class Collection
		    // mỗi phần tử trong treeMap bao gồm 2 phần
		    // key (Integer) và value (String)
		    Map<Integer, String> treeMap = new TreeMap<>();
		         
		    // Thêm value vào trong treeMap với key tương ứng 
		    treeMap.put(1, "One");
		    treeMap.put(0, "Zero");
		    treeMap.put(2, "Two");
		    treeMap.put(4, "Four");
		    treeMap.put(21, "Twenty first");
		    treeMap.put(5, "Five"); 
		    System.out.println("Cac phan tu co trong hashMap \n" + hashMap);
		    System.out.println("Cac phan tu co trong linkedHashMap \n" + linkedHashMap);
		    System.out.println("Cac phan tu co trong treeMap \n" + treeMap);
		    
		    
	}

}
