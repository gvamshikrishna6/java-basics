package string_prgms;

public class string_method2
{
public static void main(String[] args)
{
	String batch_name="BAK123NfN";
	System.out.println(batch_name.charAt(0));
	System.out.println(batch_name.charAt(4));	
 System.out.println(batch_name.indexOf('f'));
 String batch_name1="BAK123NfN";
 System.out.println(batch_name.equals(batch_name1));
 String a="      testing  batch     ";
 System.out.println(a.trim());
 String batch_name121="hasini";
 
 String batch_name122="rajini";
 System.out.println(batch_name121.equals(batch_name122) );
 String name="mkt school in banglore";
 System.out.println(name.contains("mkt"));
 String name_111="hardik";
 System.out.println(name_111.substring(4));
 System.out.println(name_111.substring(0, 5));
}
}
