package practiceseccion3;

import java.util.Scanner;
//calculate sum of digits

public class SumofDigit 
{
	int digitsum(int i)
	{
		int sum=0;
		for(;!(i%10==0&&i/10==0);)
		{
			sum=sum+(i%10);
			i=i/10;
		}
		return(sum);
	}
	
	int adddigit(String s)
	{int add=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			add=add+s.charAt(i);
		}
		return(add);
	}

	public static void main(String[] args) 
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("enter the no");
		SumofDigit sd=new SumofDigit();
		System.out.println("sum of digits: "+sd.digitsum(reader.nextInt()));
		//System.out.println("sum of digits:"+sd.adddigit(reader.next()));
		//it is adding ascii code
		
	}

}
