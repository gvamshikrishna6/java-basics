package rectangle1;

import java.util.Scanner;

public class Rectangle_area
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the length value");
		System.out.println("enter the width value");
		int length = s1.nextInt();
		int width=    s1.nextInt();
		int areaofrectangle=length*width;
	int circumofrectangle=2*(length*width);
		System.out.println(areaofrectangle);
		System.out.println(circumofrectangle);
	}

}
