import java.util.Calendar;

public class date {
   public static void main(String[] args) {
	   
	   //Tao doi tuong Calendar mo ta thoi gian hien tai cuam ya tinh
	Calendar cal = Calendar.getInstance();
	//hiển thị ngày hiện tai
    // Calendar.DAY_OF_MONTH sẽ cho biết ngày hiện tại của tháng hiện tại
    // hàm get() sẽ trả về giá trị ngày hiện tại
	System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	// hien thi thang hien tai
	System.out.println(cal.get(Calendar.MONTH)+1);
	// hien thi nam hien tai
	System.out.println(cal.get(Calendar.YEAR));
	
	// hien thi thoi gian hien tai
	System.out.println(cal.getTime());
	
	
}
}
