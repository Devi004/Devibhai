package deviprasad.aug14;

import java.io.*;

public class Prac3 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		File f=new File("D://Devi.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Hello");
		bw.newLine();
		bw.write("India");
		bw.flush();
		
		
				

	}

}
