package string_prgms;

public class string_reverse1
{
	public static void main(String[] args)
	{
		String input="tech mahindra";
		String output=" ";
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			output=output+c1;
		System.out.println(output);
	}
	}

}
