package deviprasad.aug14;
import java.io.*;
public class Prac4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr=new FileReader("D://Devi.txt");
		BufferedReader bw=new BufferedReader(fr);
		
		String str="";
		
		
		while((str=bw.readLine())!=null)
		{
			System.out.println(str);
		}
		
		
		
		

	}

}
