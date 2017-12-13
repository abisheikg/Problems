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
		
		int length = str.length;
		char rev[] = new char[length];// This is important else there will be problems if memory is not allocated properly
		int i=0;
		//System.out.println(str.length);System.out.println(str);
		for (i=0;i<str.length; i++)
		{
		rev[i]= str[length-i-1];
		//System.out.println(str[length-i-1]);
		//System.out.println(length -i-1);
		}
		
		return rev;
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
		
		str = reverseString(str);
	    System.out.println("Reversed String is "+ new String(str));
	    int i;
	    //String[] stringList = new String[str.length];
	    int j;
	    int start=0;
	    String finalString= "";
	    for(i=0;i<str.length;i++)
	    {
	        if(str [i]==' ')
	        {
	        start++;
	        finalString = finalString + " ";
	        continue;
	        }
	            if(i+1==str.length||str[i+1]==' ')
	            {
	            char newarray[] = new char [i-start+1];
	            int k=0;
	            for (j=start;j<=i;j++,k++)
	            {
	            newarray[k]=str[j];
	            }
	            newarray= reverseString(newarray);
	            finalString = finalString + new String(newarray);
	            System.out.println("Reversed String is "+ new String(newarray));
                start =i+1;
	            } 
	        

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
		return finalString.toCharArray();
	}
	
	public static void main(String args[])
	{
		char str[]= null;
		String s = "Hello  World";
		str = new char[s.length()];
		str = reverseString(str);
		if(str== null)
		{
		System.out.println("String is null");
		}
		str = s.toCharArray();
		System.out.println(str.length);
		str = reverseString(str);
		System.out.println("Reversed String is "+ new String(str));
		str = new char[s.length()];
		str = s.toCharArray();
		str = reverseSentence(str);
		System.out.println("Reversed Sentence is "+ new String(str));
	}
}



/*
Solutions

https://stackoverflow.com/questions/2713655/reverse-a-given-sentence-in-java


Approach 1:
String[] words =  "This is interview question".split(" ");\

String rev = "";
for(int i = words.length - 1; i >= 0 ; i--)
{
   rev += words[i] + " ";
}

// rev = "question interview is This "


Approach 1.2:
// can also use StringBuilder:
StringBuilder revb = new StringBuilder();
for(int i = words.length - 1; i >= 0 ; i--)
{
   revb.append(words[i]);
   revb.append(" ");
}
// revb.toString() = "question interview is This "

Or Use:

String[] words = sentence.split(" ");
String[] reversedWords = ArrayUtils.reverse(words);
String reversedSentence = StringUtils.join(reversedWords, " ");

/*


