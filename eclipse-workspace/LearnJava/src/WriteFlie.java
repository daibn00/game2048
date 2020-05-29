
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WriteFlie {
     public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException  {
	  PrintWriter printwriter = new PrintWriter("KQ.txt","UTF-8");
	  printwriter.println(1);
	  printwriter.println(1);
	  printwriter.println(1);
	  printwriter.println(1);
	  printwriter.println(1);
	 
	  printwriter.close();
	}
}
