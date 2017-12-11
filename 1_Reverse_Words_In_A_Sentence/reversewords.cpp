#include<iostream>
using namespace std;
#include<string.h>

void reverseString(char* str, int length)
{
	if (str == NULL)
	{
		return;
	}
	if (length<=1)
	{
		return;
	}
	char *p=NULL;
	p = new char[length];
	strncpy(p, str, length);
	int i;
	for (i=0; i<length;i++)
	{
	str[i]=p[length-i-1];
	}
	delete p;
	return;
}

void reverseWithSpaces(char* str, int length)
{

	if( str == NULL)
		return;
	if (length<=1)
	{
		return;
	}
	int i, start=0;
	for(i=0;i<length;i++)
	{
	if(str[i]==' ')
	{
		start++;
		continue;
	}
	if (str[i+1]==' '||str[i+1]=='\0')
	{
		if(i>0)
		{
		reverseString(str+start,i-start+1);
		start=i+1; 
		}
		else
		{
		start++;
		}
	}
	
	}
	reverseString(str+start,length-start+1);
}

void reverseWords(char* str) //, int length) Usually pass the second argument as length
{
	if (str == NULL)
	{
		cout <<"String is NULL"<<endl;
		return; 
	}
	int length = strlen(str);
	cout<<"String to be reversed is : "<<str<<endl;
	cout<<"Length of the string is:" <<length<<endl;
    //1. Reverse the whole string
	reverseString(str, length);
    cout<<"Reverse string is : "<<str<<endl;
    //2.With the reverse string reverse each string within the spaces
    reverseWithSpaces(str, length);
    cout<<"Reverse sentence is : "<<str<<endl;
    
}

int main()
{
	char *p = NULL;
	//reverseWords("Hello World");
	///reverseWords("");
	reverseWords(p);
	p = new char[100];
	strcpy(p,"Hello");
	reverseWords(p);
	strcpy(p,"Hello World");
    reverseWords(p);
    strcpy(p,"This is   done");
    reverseWords(p);
	delete p;
}


