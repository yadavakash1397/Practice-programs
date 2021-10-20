package practicesession6;

import java.util.Scanner;

public class SquareRootDecimal 
{
	static void sqroot(int x)
	{
		float a=x;
		float i;
		for( i=1;(i*i)<=a;i+=0.000001f);	
		System.out.printf("sq root is:"+"%.3f",i);
		
	}

	public static void main(String[] args) 
	{
		Scanner reader=new Scanner(System.in);	
		System.out.println("enter no");
		sqroot(reader.nextInt());

	}

}
