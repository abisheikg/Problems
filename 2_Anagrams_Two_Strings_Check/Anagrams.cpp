/*
Approach 1: Sort the two arrays and check if they are equal
Time: o(n log n)
Space : O(1) no extra space

Approach 2:
Time : O(n)
Space : O(size of alphabet) for count array or O(n) if/ hash map is used)
*/




#include<iostream>
#include<string.h>
using namespace std;
#define SIZE_OF_ALPHABET 256 
//Since character has 1 byte = 2^8 -128 to 127 or 0 to 255


bool checkAnagrams(char *str1, char *str2) //TODO: deprecated converstion from string to char * 
{

    int n1= strlen(str1);
    int n2= strlen(str2);
    if (n1!=n2)
        return false;
    int count1[SIZE_OF_ALPHABET]={0};
    int count2[SIZE_OF_ALPHABET]={0};
    int i;
    for (i=0;i<n1;i++)
    {
    count1[str1[i]]++;
    count2[str2[i]]++;
    }
    for (i=0;i<SIZE_OF_ALPHABET;i++)
    {
    if(count1[i]!=count2[i])
        return false;
    }
    return true;
    
}

int main()
{
    cout<<"Anagrams"<<endl;
    char *str1= new char[100];
    char *str2= new char[100];
    strcpy(str1,"aacc");
    strcpy(str2,"caca");
    if (checkAnagrams(str1, str2))
    {
    cout<<"They are anagrams: "<<str1<<" and "<<str2<<endl;
    }
    else
    {
    cout<<"They are not anagrams:  "<<str1<<" and "<<str2<<endl;
    }
    
    
    strcpy(str1,"aacc");
    strcpy(str2,"cacab");
    
    if (checkAnagrams(str1, str2))
    {
    cout<<"They are anagrams: "<<str1<<" and "<<str2<<endl;
    }
    else
    {
    cout<<"They are not anagrams:  "<<str1<<" and "<<str2<<endl;
    }
    
    strcpy(str1,"aacb");
    strcpy(str2,"cabc");
    
    if (checkAnagrams(str1, str2))
    {
    cout<<"They are anagrams: "<<str1<<" and "<<str2<<endl;
    }
    else
    {
    cout<<"They are not anagrams:  "<<str1<<" and "<<str2<<endl;
    }
    
    
    strcpy(str1,"abcd");
    strcpy(str2,"abca");
    
    if (checkAnagrams(str1, str2))
    {
    cout<<"They are anagrams: "<<str1<<" and "<<str2<<endl;
    }
    else
    {
    cout<<"They are not anagrams:  "<<str1<<" and "<<str2<<endl;
    }
    
    //checkAnagrams("aaac","abac");


}
