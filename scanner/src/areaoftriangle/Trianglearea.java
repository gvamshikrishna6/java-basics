package areaoftriangle;

import java.util.Scanner;

public class Trianglearea
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the breadth value");
		System.out.println("enter the height value");
		System.out.println("enter the length value");
		int breadth=      s1.nextInt();
		int height=       s1.nextInt();
		int length=     s1.nextInt();
		int areaoftriangle=(breadth*height)/2;
		int circumoftriangle=length+breadth+height;
		System.out.println(areaoftriangle);
	}

}
