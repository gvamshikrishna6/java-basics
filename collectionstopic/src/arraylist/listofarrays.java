package arraylist;

import java.util.ArrayList;

public class listofarrays
{
public static void main(String[] args)
{
	ArrayList a1=new ArrayList();
	a1.add("ram");
	a1.add("sita");
	a1.add("laxman");
	System.out.println(a1);
	ArrayList a2=new ArrayList();
	a2.add("krishna");
	a2.add("vamshi");
	System.out.println(a2);
 a1.add(1,"ajay");
	System.out.println(a1);
	a2.remove("laxman");
	System.out.println(a2);
	a2.contains("ajay");
	System.out.println(a2);
	a2.remove(a1);
 	System.out.println(a2.size());
	System.out.println(a1.size());
	System.out.println(a1.isEmpty());
	
}
}
