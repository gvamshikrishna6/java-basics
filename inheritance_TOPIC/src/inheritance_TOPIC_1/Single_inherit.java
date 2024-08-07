package inheritance_TOPIC_1;
class Second_inherit
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
public class Single_inherit extends Second_inherit
 
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
