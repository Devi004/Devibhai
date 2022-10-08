package deviprasad.aug14;

public class Pract65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rev=0,num=121;
		
		int a=num;
		
		while(num>0)
		{
			rev=(rev*10)+(num%10);
			num=num/10;
			
		}
		
		if(rev==a)
		{
			System.out.println("Palindrome Number");
		}
		
		else
		{
			System.out.println("None Palindrome");
		}
		

	}

}
