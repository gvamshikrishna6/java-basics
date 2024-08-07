package scanner_program1;

import java.util.Scanner;

public class Scannerareaofcircle {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the radius value");
		int radius = s1.nextInt();
		 
		double areaofcircle = Math.PI * radius * radius;
		double circumference=2*Math.PI*radius;
		System.out.println(areaofcircle);
	System.out.println(circumference);
}
}