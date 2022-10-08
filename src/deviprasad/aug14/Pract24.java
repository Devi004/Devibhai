package deviprasad.aug14;


abstract class bike{

	abstract void run();
}


class hero extends bike
{
	public void run()
	{
		System.out.println("Honda Bike is Running");
	}
}

public class Pract24 {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		honda n=new honda();
		n.run();
		
		
		

	}
	
	
	
	
	

}
