package inheritance_TOPIC_1;
class second
 {
static void house()
{
	System.out.println("father have house");
}
static void car()
{
	System.out.println("father have car");
}
}
public class Single_level_inherit extends second
 
{
	static void laptop()
	{
		System.out.println("child have laptop");
	}
	static void bike()
	{
		System.out.println("child have bike");
	}	
	public static void main(String[] args)
	{
		laptop();
			bike();
			car();
			house();
	
		
		
	}
}



