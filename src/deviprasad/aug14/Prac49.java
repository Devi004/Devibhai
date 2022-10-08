package deviprasad.aug14;

interface A
{
	void a();
	void b();
	void c();
}

class B implements A
{
	public void a()
	{
		System.out.println("I am a");
	}
	public void b()
	{
		System.out.println("I am b");
	}
	public void c()
	{
		System.out.println("I am c");
	}
}

public class Prac49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A fd=new B();
		fd.a();
		fd.b();
		fd.c();

	}

}
