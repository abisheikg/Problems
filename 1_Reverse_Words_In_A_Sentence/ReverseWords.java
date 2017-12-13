import java.util.*;

class ReverseWords
{
    
    public static char[] reverseString(char str[])
	{
		if (str == null)
		{
			System.out.println("String is null in Function");
			return null;
		}
		if (str.length<=1)
		{
			return str;
		}
		
		return str;
    }
    
	public static char[] reverseSentence(char str[])
	{
		if (str == null)
		{
			System.out.println("String is null in Function");
			return null;
		}
		if (str.length<=1)
		{
			return str;
		}
		/*
		char[] p = new char[str.length];
		strncpy(p, str, length);
		int i;
		for (i=0; i<length;i++)
		{
		str[i]=p[length-i-1];
		}
		delete p;
		return;
		*/
		return str;
	}
	
	public static void main(String args[])
	{
		char str[]= null;
		String s = "Hello World";

		str = reverseString(str);
		if(str== null)
		{
		System.out.println("String is null");
		}
		str = s.toCharArray();
		System.out.println(str.length);
		str = reverseString(str);
		System.out.println(str);
	}
}
