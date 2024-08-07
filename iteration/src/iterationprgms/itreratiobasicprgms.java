package iterationprgms;

import java.util.ArrayList;
import java.util.ListIterator;

public class itreratiobasicprgms
{
public static void main(String[] args) 
{
	ArrayList s1=new ArrayList();
	s1.add("arjun");
	s1.add("raj");
	s1.add("sai");
	s1.add('h');
	s1.add(89);
	System.out.println(s1);
	ListIterator s2= s1.listIterator();
	while(s2.hasNext())
	{
		System.out.println(s2.next());
	}
	while(s2.hasPrevious())
	{
		System.out.println(s2.previous());
	}
}
}
