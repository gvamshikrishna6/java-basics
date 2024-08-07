package collectionsinjava;

import java.util.Collections;
import java.util.Vector;

public class Vector_1
{
	public static void main(String[] args) 
	{
		Vector q1=new Vector();
		q1.add("kumar");
		q1.add("pratap");
		q1.add("mahesh");
		q1.add("k");
		q1.add("true");
		q1.add("null");
		q1.add("true");
		Collections.sort(q1);
		System.out.println(q1);

	}

}
