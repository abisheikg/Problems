//
// package whatever; // don't place package name!
/* 
Write a function that, given a string, determines whether that string
contains properly balanced sets of parentheses, brackets, and braces. (That is,
'(', ')', '[', ']', '{', and '}'). Note that these characters cannot be
"interlaced"; for example, the string "({)}" would be invalid because two sets
of characters are interlaced.
*/
// "" -> true
// "[()]()" -> true
// "(((" -> false
// "({)}" -> false 

import java.io.*;
import java.util.*;


// {'<', '>'} -> 

class Paranthesis {
public static boolean paranthMatch (String s)
{
  
  char charArray[] = s.toCharArray();
  int length = charArray.length;
  if(length==0)
    return true;  
  int i=0;
  HashMap<Character,Character> map = new HashMap<Character,Character>();
  map.put('(',')');
  map.put('{','}');
  map.put('[',']');
  char stackArray[]= new char[length];
  int top =0;
  //System.out.println(top);
  
  for (i=0;i<length;i++)
  {
    //if(charArray[i]=='('||charArray[i]=='['||charArray[i]=='{')//
    if (map.containsKey(charArray[i]))  
    {
      stackArray[top]= charArray[i];
      top++;
    }
    //if(charArray[i]==')'||charArray[i]==']'||charArray[i]=='}')
    if(map.containsValue(charArray[i]))
    {
      if(top<=0)
      {
        return false;
      }
      //System.out.println(top);
      
      if(map.get(stackArray[top-1]) == charArray[i])
      {
        top--;
        continue;
      }
      /*if (stackArray[top-1]=='(' && charArray[i]==')')
      {
      top--;
      continue; 
      }
      if (stackArray[top-1]=='{' && charArray[i]=='}')
      {
      top--;
      continue; 
      }
      if (stackArray[top-1]=='[' && charArray[i]==']')
      {
      top--;
      continue; 
      }
      */
      return false;
    }
   }
    if (top !=0)
    {
      return false;
    }
    return true;
}
  public static void main (String[] args) {
    System.out.println("Paranthesis Matching");
    System.out.println(paranthMatch("()"));
    System.out.println(paranthMatch(")()"));
    System.out.println(paranthMatch(""));
    System.out.println(paranthMatch("(Hello[])"));
    System.out.println(paranthMatch("([("));
  }
}
