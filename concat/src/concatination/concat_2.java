package concatination;

import java.util.Arrays;

public class concat_2 
{
public static void main(String[] args) 
{
	String Fname="mahesh";
	String Lname="kumar";
	System.out.println(Fname.concat(" ").concat(Lname));
	String intro="my name is krishna";
	String[]a1=intro.split("");
	String[]a2=intro.split("",3);
	System.out.println(Arrays.toString(a1));
	System.out.println(Arrays.toString(a2));
}
}
