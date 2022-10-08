package deviprasad.aug14;

abstract class bike
{
	abstract void run();
	abstract void walk();
}

class honda extends bike
{
	public void run()
	{
		System.out.println("Honda Bike is running");
	}
	
	 public void walk()
	{
		System.out.println("honda bike is walking");
	}
}

public class Pract35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		honda h=new honda();
		h.run();
		h.walk();

	}

}
