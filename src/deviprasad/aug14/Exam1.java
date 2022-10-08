package deviprasad.aug14;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String str="aaaaabbbcccdd";
	
	Map<Character, Integer> mp=new HashMap<Character,Integer>();
	
	for (int i = 0; i <str.length(); i++) {
		
		if(mp.get(str.charAt(i))!=null)
		{
			
			mp.put(str.charAt(i), mp.get(str.charAt(i))+1);
		}
		
		else
		{
			
			mp.put(str.charAt(i), 1);
			
		}
		
		
		}
	
		
		
	
	
	StringBuffer bf =new StringBuffer();
	
	for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
		
		
		bf.append(entry.getKey());
		bf.append(entry.getValue());
		
	
	}
	System.out.println(bf.toString());
	} 

}
