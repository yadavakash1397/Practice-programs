package practicesession6;

import java.util.Scanner;

public class Squareroot 
{
	static int sqroot(int x)
	 {
		 int i;
		 for( i=1;(i<x)&&(i*i)!=x;i++);
		 if(i==x)
		 return(0);
		 else
		 return(i);
	 }

	public static void main(String[] args) 
	{
		Scanner reader=new Scanner(System.in);
		
		System.out.println("enter no");
		System.out.println("sq root of no is:"+sqroot(reader.nextInt()));
		

	}

}
