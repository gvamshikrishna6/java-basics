package upanddowncasting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
public class arraylisttolist 
{
public static void main(String[] args)
{
	List s1=new ArrayList();
	s1.add("186");
	s1.add("rose");
	s1.add('k');
	s1.add("soup");
	s1.add(9.99);
	s1.add("rose");
	s1.add("null");
	s1.add("null");
	System.out.println(s1);
	Iterator a1=   s1.iterator();
	while(a1.hasNext())
	{
		System.out.println(a1.next());
	}
	ListIterator a2=     s1.listIterator();
	while(a2.hasNext())
	{
		System.out.println(a2.next());
	}
	while(a2.hasPrevious())
	{
		System.out.println(a2.previous());
	}
	System.out.println("understanding set");
	Set c1=    new HashSet();
	c1.add("186");
	c1.add("rose");
	c1.add('k');
	c1.add("soup");
	c1.add(9.99);
	c1.add("rose");
	c1.add("null");
	c1.add("null");
	System.out.println(c1);
	Iterator p1=   c1.iterator();
	while(p1.hasNext())
	{
		System.out.println(p1.next());
	}
}
}
