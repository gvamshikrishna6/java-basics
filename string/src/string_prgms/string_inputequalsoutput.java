package string_prgms;

import java.util.Arrays;

public class string_inputequalsoutput 
{
 
public static void main(String[] args) 
{
	int input[]=new int[3];
 	input[0]=98;
	input[1]=87;
	input[2]=79;
	int output[]=new int[3];
 	for(int i=0;i<=2;i++)
	{
		output[i]=input[i];
		}
	System.out.println(Arrays.toString(input));
	System.out.println(Arrays.toString(output));
}
}
