package multi_nonpara;
class microsoft  
	{
		 void auth1()
	{
			System.out.println("1");
			}
		}
	  class google extends microsoft
	{
		 void auth2()
		{
			System.out.println("2");
		}
	}
			public class NON_paramulti extends google
			{
				static void auth3()
				{
					System.out.println("3");
		}
			public static void main(String[] args)
			{
				NON_paramulti a1=new  NON_paramulti();
				a1.auth1();
				a1.auth2();
				a1.auth3();
			}

			}