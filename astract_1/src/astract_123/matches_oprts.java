package astract_123;

public class matches_oprts 
{
public static void main(String[] args) {
	
	String s1="ravindra jaddu";
System.out.println(s1.matches("(.*)i"));
System.out.println(s1.matches("a(.*)"));
System.out.println(s1.matches("(.*)i(.*)"));
String q1="raju";
System.out.println(q1.matches("..."));
System.out.println(q1.matches("..."));
System.out.println(q1.matches("...."));

}
}
