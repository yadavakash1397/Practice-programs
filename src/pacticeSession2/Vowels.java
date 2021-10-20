package pacticeSession2;

import java.util.Scanner;

//no of vowels and consonants in given string
public class Vowels
{

	public static void main(String[] args)
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("enter the string");
		String S=reader.nextLine();
		//String S="akash";
		String Sl=S.toLowerCase();
		char ar[]=Sl.toCharArray();
		System.out.println("length of string is "+(S.length()));
		char ch[]= {'a','e','i','o','u'};
		
		int count=0;
		for(char c:ch) 
		{
			for(char d:ar) 
			{
				if(c==d)
				{
					count++;
				}
			}
		}
		System.out.println("No of vowels are "+count);
		System.out.println("No of consonants are "+(S.length()-count));
		System.out.println(S.compareTo("akash"));
		

	}

}
