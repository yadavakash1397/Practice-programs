package practiceseccion3;

import java.util.Scanner;
//print words in sentences
public class NoOfWord 
{
	static void wordno(String s)
	{
		int c=0;
		if(!s.isEmpty())
		{
			c++;
			for(int i=0;i<s.length();i++)
			{	
				if((int)s.charAt(i)==32)            //32 is ASCII code of space
				{
					c++;
				}
			}
		}
		System.out.println("words in sencentence:"+c);
	}

	public static void main(String[] args) 
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("enter the sentence");
		wordno(reader.nextLine());
		
		//non static method call from diff class
		
		//SumofDigit rj=new SumofDigit();
		//System.out.println(rj.digitsum(12345));
		

	}
	
	public static void Count_similarwords(String[]a)
	{
		
		
	}

}
