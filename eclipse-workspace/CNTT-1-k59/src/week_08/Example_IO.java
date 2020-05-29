package week_08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class Example_IO {

//	private static void checkVirus(File file) {
//		if (file.isFile()) {
//			System.out.println(file.getAbsolutePath());
//		} else {
//			System.out.println(file.getAbsolutePath());
//			File[] lFile = file.listFiles();
//			for (File f : lFile) {
//				Example_IO.checkVirus(f);
//			}
//
//		}
//	}
	
	public static int fileReader(File file) {
		FileReader fr = null;
		BufferedReader br = null;
		int sum = 0;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			String data;
			
			while ((data = br.readLine()) != null) {
				try {
					String[] datas = data.split(":");
					for (String string : datas) {
						int value = Integer.parseInt(string);
						sum += value;
					}
					
				}catch(NumberFormatException e) {
					e.printStackTrace();
				}
				
			}
			System.out.println(sum);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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
     
	public static void writeReader(File file_out,int sum) {
		FileWriter fw = null;
		BufferedWriter bw =  null;
		try {
			fw = new FileWriter(file_out);
			bw = new BufferedWriter(fw);
			bw.write("Ket qua : ");
			bw.write("" +sum);
			bw.newLine();
			bw.write("End");
				
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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
		File file_in = new File("F:\\test.txt");
		File file_out = new File("F:\\test1.txt");
		int sum = Example_IO.fileReader(file_in);
		Example_IO.writeReader(file_out, sum);	
		//Example_IO.checkVirus(file);
	}

}
