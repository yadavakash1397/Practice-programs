package practiceSession12;

import java.util.Scanner;

public class PrimeNo 
{
	public static void main(String[] args)
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("enter min range");
		int min=reader.nextInt();
		System.out.println("enter max range");
		int max=reader.nextInt();
		
		int c=0;
		for(int a=min;a<=max;a++) //a is actual no. we want to check
		{
			if(a==0||a==1)
			{
				c++;
			}
			else
			{
				for(int i=2;i<a;i++)//i is we are dividing no by from 2 to onwards
				{
					if(a%i==0)
					{
						c++;
						break;
					}
				}
			}
			if(c==0)
			{
				System.out.print(a+" ");
			}
			else
			{
				c=0;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
