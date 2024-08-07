package super_login_1;
class Class_random_1
{
	void login()
	{
		System.out.println("ring the bell at 4pm");
		
	}
	}
public class class_methodoverriding extends  Class_random_1
{
 void login()
{
	 super.login();
	 System.out.println("dont ring the bell untill it is 4pm");
	
	}
 public static void main(String[] args) 
 {
	 class_methodoverriding s1=new  class_methodoverriding();
	 s1.login();
}
 
 {
 }
}
