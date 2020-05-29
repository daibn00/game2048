package B1;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		List<DuongThang>lists = new ArrayList<>();
		
		DuongThang dt1 = new DuongThang(1, 3);
		DuongThang dt2 = new DuongThang(5, -3);
		DuongThang dt3 = new DuongThang(-6, 12);
		DuongThang dt4 = new DuongThang(0, 9);
		
		
		lists.add(dt1);
		lists.add(dt2);
		lists.add(dt3);
		lists.add(dt4);
		
		int count = 0;
		for (DuongThang duongThang : lists) {
			if(duongThang.check(10, 5)) {
				count++;
			}
		}
		
		System.out.println("so duong thoa man " + count);
		
		double sum = 0;
		for (DuongThang duongThang : lists) {
			sum += duongThang.distance();
		}
		
		System.out.println("Tong khoang cach " + sum);
		
		for (DuongThang duongThang : lists) {
			System.out.println(duongThang.toString());
		}
	}

}
