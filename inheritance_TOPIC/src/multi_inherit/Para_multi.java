package multi_inherit;
class microsoft  
{
	static void auth1()
{
		System.out.println("1");
		}
	}
  class google extends microsoft
{
	static void auth2()
	{
		System.out.println("2");
	}
}
		public class Para_multi extends google
		{
			static void auth3()
			{
				System.out.println("3");
	}
		
 public static void main(String[]args)
 {
	 auth3();
	 auth2();
	 auth1();
 }
 }
