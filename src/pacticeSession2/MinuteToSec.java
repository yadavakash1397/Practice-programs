package pacticeSession2;

import java.util.Scanner;

//write function that takes an int minutes and convert it to seconds

public class MinuteToSec 
{
	void Convert(int x)
	{
		System.out.println("second for given min are "+(x*60));
	}

	public static void main(String[] args) 
	{
		MinuteToSec ms=new MinuteToSec();
		Scanner reader=new Scanner(System.in);
		
		
		ms.Convert(20);
		System.out.println("enter time in minutes");
		ms.Convert(reader.nextInt());

	}

}
