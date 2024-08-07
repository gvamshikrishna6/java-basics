package string_prgms;

public class string_methods1
{
public static void main(String[] args)
{
	String i="hello";
	System.out.println(i.isEmpty());
 System.out.println(i.lastIndexOf('e'));
 String b="sai kumar";
 String new1=b.replace('a','m');
 System.out.println(new1);
 String n2=b.replaceAll(" "," ");
 System.out.println(n2);
 String c="pratap kumar";
 System.out.println(c.replaceAll("david", "warner"));
 String d="school123";
		 System.out.println(d.replaceAll("[0-9]"," "));
		 System.out.println(d.replaceAll("[a-z]"," "));
		 String e="HYD123 highway";
		 System.out.println(e.replaceAll("[A-Z]"," "));

  }
}
