package supercalling;

 
class floor_1
{
	floor_1()
	{
		 System.out.println("go to room 1");
	}
	}

public class Super_callingstatment extends floor_1
{
	Super_callingstatment()
	{
		 
		System.out.println("go to top  floor");
	}
	public static void main(String[] args) 
	{
		new Super_callingstatment();
		
	}
}
