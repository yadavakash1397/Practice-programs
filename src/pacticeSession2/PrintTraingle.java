package pacticeSession2;

import java.util.Scanner;

//print format
/*
*
**
***
****
*****
******/
public class PrintTraingle 
{

	public static void main(String[] args) 
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("enter length");
		int x=reader.nextInt();
//		for(int i=0;i<=x;i++)
//		{
//			for(int j=i;j>=0;j--)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		
//		for(int i=1;i<=x;i++)
//		{
//			for(int j=x-i;j>=0;j--)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		int star=1;
//		
//		for(int i=1;i<=x;i++)
//		{
//			for(int j=1;j<=star;j++)
//			{
//				System.out.print("*");
//			}
//			star++;
//			System.out.println();
//		}
		
		x=x*2-1;
		int star=1;
		for(int i=1;i<=x;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
				
			}
			if(i<=x/2)
			{
				star++;
			}
			else
			{
				star--;
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
