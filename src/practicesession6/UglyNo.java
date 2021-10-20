package practicesession6;

import java.util.Scanner;

//ugly no means no is prime divided by2,3, or5

public class UglyNo 
{
	static void isugly(int a)
	{
		
		for(;;)
		{
			if(a%2==0)
			{
				a=a/2;
			}
			if(a%3==0)
			{
				a=a/3;
			}
			if(a%5==0)
			{
				a=a/5;
			}
			if(((a%2!=0)&&(a%3!=0)&&(a%5!=0))||(a==1))
			{
				break;		
			}
		}
		if(a==1)
		{
			System.out.println("given no is ugly");
		}
		else
		{
			System.out.println("given no is not ugly");
		}
		
	}

	public static void main(String[] args) 
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("enter the no");
		isugly(reader.nextInt());

	}

}
