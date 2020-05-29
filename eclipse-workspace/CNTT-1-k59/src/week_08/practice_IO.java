package week_08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class practice_IO {
	
	public static double sumFile(File f) {
		FileReader fr = null;
		BufferedReader br = null;
		double sum = 0;
		try {
			fr = new FileReader(f);
		    br = new BufferedReader(fr);
		    String data;
		    try {
				while((data = br.readLine())!= null) {
					try {
						String data1[] = data.split(" ");
						for (String string : data1) {
							double value = Double.parseDouble(string);
							sum += value;
						}
						
					}catch(NumberFormatException e) {
						e.printStackTrace();
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return sum;		
	}
	public static int countNumberPositive(File f) {
		FileReader fr = null;
		BufferedReader br = null;
		int count = 0;
		try {
			fr = new FileReader(f);
		    br = new BufferedReader(fr);
		    String data;
		    try {
				while((data = br.readLine())!= null) {
					try {
						String data1[] = data.split(" ");
						for (String string : data1) {
							double value = Double.parseDouble(string);
							if(value > 0) {
								count++;
							}
						}
						
					}catch(NumberFormatException e) {
						e.printStackTrace();
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return count;		
	}
	
	public static void writeFile(File f, double sum, int count) {
		FileWriter fw =null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);
			bw.write("Tổng các số = " + sum);
			bw.newLine();
			bw.write("Đếm "  + count);
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
			
		}finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args) {
		File f = new File("F:\\pratice_IO.txt");		
		practice_IO.writeFile(new File("F:\\pratice_Out.txt"), practice_IO.sumFile(f), practice_IO.countNumberPositive(f));
		
	}

}
