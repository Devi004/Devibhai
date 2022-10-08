package deviprasad.aug14;

abstract class bik{
	
	abstract void run();
}

class hond extends bik
{
	public  void run()
	{
		System.out.println("Honda bike is running");
	}
}

public class Abst01 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hond h=new hond();
		h.run();
	}

}
