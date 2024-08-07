package super_login_1;
class Assignment_1
{
	void login() 
	{
		System.out.println("life is simple");
		
	}
	}
public class class_assignment extends  Assignment_1
{
void login()
{
	super.login();
	System.out.println("dont bother about it");
}
public static void main(String[] args) 
{
	 class_assignment s1=new  class_assignment ();
	 s1.login();
}
}
