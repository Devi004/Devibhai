package deviprasad.aug14;

import java.util.Scanner;

public class Example345 {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Devi Prasad";
		
		str=str+" ";
		
		String word="",revsen="";
		
		for (int i = 0; i <str.length(); i++) {
			
			char ch=str.charAt(i);
			
			if(ch!=' ') {
				
				word=word+ch;
				
			}
			else
			{
				revsen=word+" "+revsen;
				word="";
			}
			
		}
		
		System.out.println(revsen);
		
	}

}
