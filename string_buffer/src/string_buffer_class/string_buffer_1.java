package string_buffer_class;

public class string_buffer_1
{
public static void main(String[] args)
{
	String s2=new String("raman");
	s2.concat("srinivasa");
	System.out.println(s2);
	System.out.println(s2.indexOf("m"));
	StringBuffer s1=new StringBuffer("raman");
	s1.append("srinivas");
	System.out.println(s1);
	System.out.println(s1.length());
	System.out.println(s1.substring(1));
	System.out.println(s1.substring(2, 5));
	System.out.println(s1.indexOf("m"));
	System.out.println(s1);
	System.out.println(s1.isEmpty());
	System.out.println(s1.replace(0, 6, "krishna"));
	StringBuffer s4=new StringBuffer("rohit sharma");
	System.out.println(s4.delete(0, 6));
	StringBuffer s3=new StringBuffer("ratan tata");
	System.out.println(s3.reverse());
	
	
}
}
