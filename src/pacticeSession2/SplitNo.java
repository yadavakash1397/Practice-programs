package pacticeSession2;

import java.util.Scanner;

//split the number into two halves
public class SplitNo 
{
	void split(int x)
	{
		if(x%2==0)
		{
			System.out.println("["+(x/2)+" "+(x/2)+"]");
		}
		else
		{
			System.out.println("["+(x/2+" "+((x/2)+1))+"]");
		}
	}

	public static void main(String[] args) 
	{
		SplitNo sp=new SplitNo();
		Scanner reader=new Scanner(System.in);
		System.out.println("enter the no to split");
		sp.split(reader.nextInt());
		

	}

}
