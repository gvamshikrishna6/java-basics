package astract_123;
 
abstract class class3
{
	abstract void add();
	abstract void sub();
}
class class2 extends class3
{
	void login_logic()
	{
		System.out.println("login logic");
	}
	static void logout_logic()
	{
		System.out.println("logout logic");
	}
	@Override
	void add() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void sub() {
		// TODO Auto-generated method stub
		
	}
	
}
public class class_1 extends class2
{
	void voice_chat()
	{
		System.out.println("chatting via voice");
	}
	static void video_chat()
	{
		System.out.println("chatting via video chat");
	}
public static void main(String[] args) 
{
	
}
}

 
