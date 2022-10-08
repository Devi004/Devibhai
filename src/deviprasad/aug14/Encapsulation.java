package deviprasad.aug14;

public class Encapsulation {
	
	private int studrollno;
	
	private String studname;
	
	private int studage;
	
	public void setrollno(int newrollno) 
		{
			studrollno=newrollno;
		}
	

	public void setname(String newstudname) 
	{
		studname=newstudname;
	}
	
	public void setage(int newage) 
	{
		studage=newage;
	}
	
	
	
	public String getname()
	{
		return studname;
	}
	
	public int getage()
	{
		
		return studage;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation er=new Encapsulation();
		
		er.setrollno(101);
		er.setname("Devi");
		er.setage(28);
		
		System.out.println("Student roll no::"+"   "+er.getage());
		System.out.println("Student name::"+"   "+er.getname());
	}

}
