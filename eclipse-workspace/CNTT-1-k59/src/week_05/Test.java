package week_05;


import java.util.ArrayList;
import java.util.List;

public class Test {
    
	public static void main(String[] args) {
		Point2D p2D_1 = new Point2D( 10, 10);
		Point2D p2D_2 = new Point2D( 5, 5);
		
		List<Point2D> listPs = new ArrayList<Point2D>();
		listPs.add(p2D_1);
		listPs.add(p2D_2);
		
		Point3D p3D_1 = new Point3D( 10, 10, 6);
		
		double sum = 0.0;
		for(Point2D point2d : listPs) {
			sum+=point2d.distance();
		}
		System.out.println(sum);
	}
    
}
