package string_prgms;

import java.util.Arrays;

public class string_alphabets 
{
public static void main(String[] args)
{
	String input="50kilos";
 	char a1[] =    input.toCharArray();
 	System.out.println(Arrays.toString(a1));
 	System.out.println(Arrays.toString(a1));
		for(int i=2;i<input.length();i++)
		{
			boolean s1=   Character.isAlphabetic(a1[i]);
			System.out.println(s1);
		}
 	
 			 
}

  }

  

