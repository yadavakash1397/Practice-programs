package practice;

import java.util.Scanner;

public class Fibbyrecursion 
{
	static int fib(int n)
	{
		if(n==0)
		{
			return(0);
		}
		if(n==1||n==2)
		{
			return(1);
		}
		return(fib(n-1)+fib(n-2));
		
	}

	public static void main(String[] args) 
	{
		System.out.println("enter enteries");
		Scanner reader=new Scanner(System.in);
		int s=reader.nextInt();
		for(int i=0;i<=s;i++)
		{
			System.out.print(fib(i)+" ");
		}
	}

}
