package pacticeSession2;

import java.util.ArrayList;
import java.util.Scanner;

public class FactorsOfNumbers
{

	public static void main(String[] args) 
	{
		System.out.println("enter a number");
		Scanner reader=new Scanner(System.in);
		int a=reader.nextInt();
		ArrayList list=new ArrayList(); 
		
		//given no is divisible by following nos
		
		/*
		System.out.println("given no is divsible by");
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				//System.out.print(" "+i);
				list.add(i);
			}
		}
		System.out.println(list);
		*/
		
		//to calculate factors of number
		System.out.println("factors of numbers are ");
		for(int i=2;i<=a;i++) 
		{
			if(a%i==0)
			{
				list.add(i);
				a=a/i;
				i--;
			}
		}
		System.out.println(list);

		
		
	}

}
