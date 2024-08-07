package tryandcatch_prgms;

import java.util.InputMismatchException;

public class try_catch 
{
public static void main(String[] args) 
{
	try 
	{
		int c=1/0;
		System.out.println(c);
	}
	catch (ArithmeticException a)
	{
	System.out.println("i have handled the exception");
	}
	catch(InputMismatchException a)
	{
		System.out.println("i have handled the exception 2");
	}
		
	
}
}
