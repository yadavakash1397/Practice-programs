package practiceSession8;

import java.util.Scanner;

/*
*
**
* *
*  *
*   *
*  *
* *
**
*
*
*
*
*
**/
public class FlagPattern 
{

	public static void main(String[] args) 
	{
		System.out.println("enter length of flag");
		Scanner reader=new Scanner(System.in);
		int l=reader.nextInt();
		for(int i=1;i<=l;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1||j==i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=l-1;i++)
		{
			for(int j=l-1;j>=i;j--)
			{
				if(j==i||j==(l-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=l;i++)
		{
			System.out.println("*");
		}

	}

}
