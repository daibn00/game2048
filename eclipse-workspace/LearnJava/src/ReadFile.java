import java.nio.file.Paths;
import java.io.IOException;
import java.util.Scanner;
// dco du lieu tu file
public class ReadFile {
	public static void main(String[] args) throws IOException {
		Scanner scanner  = new Scanner(Paths
				.get("C:\\Users\\admin\\Desktop\\inputJava.txt"),"UTF-8");
		
		while(scanner.hasNextInt()) {
			System.out.println(scanner.nextInt());
		}
		scanner.nextLine();
		String a = scanner.nextLine();
		System.out.println(a);
		scanner.close();
	}
     
}
