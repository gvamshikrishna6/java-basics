package scanner_program;

import java.util.Scanner;

public class Square2
{
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the area value");
		int num=     s1.nextInt();
		int areaofsquare=num*num;
		 
		int circumferenceofcircle=4*num;
				System.out.println(areaofsquare);
				System.out.println(circumferenceofcircle);
	}

}
