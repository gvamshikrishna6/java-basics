package string_prgms;

import java.util.Arrays;

public class string_numeric 
{
	public static void main(String[] args)
	{
		int count_of_alpha=0;
		int count_of_numeric=0;
		String input="50grams";
		char c1[]= input.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<input.length();i++)
		{
			boolean b1=Character.isAlphabetic(c1[i]);
			boolean b2=Character.isDigit(c1[i]);
			if(b1==true)
			{
				count_of_alpha++;
				}
			if(b2==true)
			{
				count_of_numeric++;
			}
		System.out.println(count_of_alpha);
		System.out.println(count_of_numeric);
		}
			
		
	}

}
