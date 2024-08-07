package treps;

import java.util.Scanner;

public class Trepizium1
{
	 
		public static void main(String[] args)
		{
			Scanner s1 = new Scanner(System.in);
			System.out.println("enter the breadth value");
			System.out.println("enter the height value");
			System.out.println("enter the area value");
			System.out.println("enter the length value");
			int breadth=      s1.nextInt();
			int height=       s1.nextInt();
			int area=     s1.nextInt();
			int length=    s1.nextInt();
			int areaoftrepizium=((area+breadth*height))/2;
			int circumoftrepizium=(area+length+breadth+height);
			System.out.println(areaoftrepizium);
			System.out.println(circumoftrepizium);

}
}
