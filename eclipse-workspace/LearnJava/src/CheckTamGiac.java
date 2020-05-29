import java.util.Scanner;

public class CheckTamGiac {
      public static void main(String[] args) {
    	  int a,b,c;
          Scanner sc = new Scanner(System.in);
          System.out.print("Nhap a :");
          a = sc.nextInt();
          System.out.print("Nhap b :");
          b = sc.nextInt();
          System.out.print("Nhap c :");
          c = sc.nextInt();
          System.out.println("a = "+a+", b = "+b+", c = "+c);
          
          if(laTamGiac(a,b,c)) {
        	  System.out.println("La tam giac");
        	  if(TamGiacVuong(a,b,c))
        		  System.out.println("La tam giac vuong");
        	  if(laTamGiacCan(a,b,c)) {
        		  System.out.println("La tam giac can");
        		  if(TamGiacDeu(a,b,c)) {
        			  System.out.println("Va con deu nua hihi het roi ne !!!");
        		  }
        	  }
          }
          else
        	  System.out.println("Khong phai tam giac");
          sc.close();
          
	}
      public static boolean laTamGiac(int a,int b,int c) {
    	  if((a+b)>c &&(b+c)>a&&(a+c)>a) {
    		  return true;
    	  }
    	  else return false;
      }
      public static boolean TamGiacVuong(int a,int b,int c) {
    	  if((a*a+b*b)==c*c || (b*b+c*c)==a*a ||(c*c+a*a)==b*b)
    		   return true;
    	  else return false;
      }
      public static boolean laTamGiacCan(int a,int b,int c) {
    	  if(a==b||a==c||c==b)
    		  return true;
    	  else return false;
      }
      public static boolean TamGiacDeu(int a,int b,int c) {
    	  if(a==b&&a==c)
    		  return true;
    	  else return false;
      }
}
