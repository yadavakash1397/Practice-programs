package pacticeSession2;

import java.util.ArrayList;
import java.util.Scanner;
//expected op
/*
enter string
zjzrg
next letter string
akash
*/
public class ChangeLetterToNextLetter 
{

	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		Scanner reader=new Scanner(System.in);
		System.out.println("enter string");
		String s=reader.nextLine();
		System.out.println("next letter string");
		for(int i=0;i<s.length();i++)
		{
			
			int d=(int)s.charAt(i);
			if(!(d==90||d==122))
			{
				System.out.print((char) ++d);
			}
			else
			{
				System.out.print((char) (d-25));
			}
			list.add((char)d);
		}
		System.out.println(list);
		
	}

}
