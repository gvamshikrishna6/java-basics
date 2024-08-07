package collectionsinjava;

import java.util.Collections;
import java.util.LinkedList;

public class linkedlist
{
public static void main(String[] args) 
{
	LinkedList s1=new LinkedList();
	s1.add("rahul");
	s1.add("ajju");
	s1.add("ramesh");
	s1.add("k");
	s1.add("true");
 
 Collections.sort(s1);
System.out.println(s1);

}
}
