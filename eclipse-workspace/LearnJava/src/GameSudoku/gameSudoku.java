package GameSudoku;


import java.util.Scanner;

public class gameSudoku {

	   
	    private static void nhap(int a[][]) {
	    	int row,col;
	    	Scanner sc = new Scanner(System.in);
	    	System.out.print("Nhap hang : ");
	    	row = sc.nextInt();
	    	System.out.print("Nhap cot : " );
	    	col = sc.nextInt();
	    	System.out.print("Nhap Gia Tri : ");
	    	int  val = sc.nextInt();
	    	a[row][col] = val;
	    	if(check(row,col,a) == false) {
	    		System.out.println("Vui long nhap lai ");
	    		a[row][col] = 0;
	    		nhap(a);	
	    	}
	    }
	    private static void xuat(int a[][]) {
	    	
			for(int i=0;i<9;i++) {
				for(int j = 0;j<9;j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
	    }
	    private static boolean check(int row,int col , int a[][]) {
	    	for(int j = 0;j < 9;j++) {
	    		if(col != j) {
	    			if(a[row][j] == a[row][col]) {
	    				return false;
	    				
	    			}
	    		}
	    	}
	    	for(int i = 0;i < 9;i++) {
	    		if(row != i) {
	    			if(a[i][col] == a[row][col]) {
	    				return false;
	    			}
	    		}
	    	}
	    	 int Row = row - row % 3;
	         int Column = col - col % 3;
	         for (int ii = 0; ii < 3; ii++) {
	             for (int jj = 0; jj < 3; jj++) {
	            	 if((Row + ii)!=row && (Column + jj)!=col){
	            		  if (a[Row + ii][Column + jj] == a[row][col]) {
	 	                	 System.out.println(a[Row + ii][Column + jj]);
	 	                     return false;
	 	                 }
	            	 } 
	             }
	         }

	    	return true;
	    
	    }
	 
	
       public static void main(String[] args) {
		int a[][] = {
	            {3, 0, 6, 5, 0, 8, 4, 0, 0},
	            {5, 2, 0, 0, 0, 0, 0, 0, 0},
	            {0, 8, 7, 0, 0, 0, 0, 3, 1},
	            {0, 0, 3, 0, 1, 0, 0, 8, 0},
	            {9, 0, 0, 8, 6, 3, 0, 0, 5},
	            {0, 5, 0, 0, 9, 0, 6, 0, 0},
	            {1, 3, 0, 0, 0, 0, 2, 5, 0},
	            {0, 0, 0, 0, 0, 0, 0, 7, 4},
	            {0, 0, 5, 2, 0, 6, 3, 0, 0}
	        };
		xuat(a);
		int  k,l;
		boolean flag = true;
		while(flag) {
			int x = 0;
			nhap(a);
			xuat(a);
			for(k=0;k<9;k++) {
				for( l = 0;l<9;l++) {
					if(a[k][l] != 0) {
						x++;	
					}
				}
			}
			if(x==81) {
				break;
			}
		}
		System.out.println("XIn chuc mung");
	}
}
