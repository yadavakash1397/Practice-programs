package pacticeSession2;

import java.util.Scanner;

//reverse the number

public class ReverseNo 
{
	void reverse(int x)
	{
		int c=0;
		int y=x;
		for(int i=0;y!=0;i++)
		{
			
			y=y/10;
			c++;
		}
		
		System.out.println("reversed no is");
		for(int i=0; i<c;i++)
		{
			
			System.out.print(x%10);
			x=x/10;
		}
	}

	public static void main(String[] args) 
	{
		ReverseNo Rn=new ReverseNo ();
		Scanner reader= new Scanner(System.in);
		System.out.println("enter no you want  reverse");
		Rn.reverse(reader.nextInt());
		
	}

}
