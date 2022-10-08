package deviprasad.aug14;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your course");
		String st=sc.next();
		
		switch (st) {
		case "selenium":
			
			System.out.println("This course is available::"+st);
			
			break;
			
		case "Python":
			
			System.out.println("This course is available::"+st);
			
			

			



		default:
			
			System.out.println("Course is not available");
			break;
		}
		
		
		}
		
		
		
		



}
