package pacticeSession2;

import java.util.ArrayList;
import java.util.Scanner;
//find reapeated no in array list
public class RepeatNosArray 
{

	public static void main(String[] args) 
	{
		//int a[]= {10,20,10,30,40,10,20,50,60,60,60,60};
		int x=0;
		ArrayList list=new ArrayList ();
		Scanner reader=new Scanner(System.in);
		System.out.println("enter size of array list");
		x=reader.nextInt();
		System.out.println("enter values in array list");
		for(int i=1;i<=x;i++)
		{
			list.add(reader.nextInt());
		}
		
		/*list.add(20);
		list.add(10);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);
		list.add(40);
		list.add(60);
		list.add(60);
		list.add(60);
		list.add(30);
		list.add(30);
		*/
		/*
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i)==list.get(j))
				{
					list.remove(j);
					j--;
				}
			}
		}
		*/
		System.out.println(list);
		
		
		
		//[10, 20, 10, 10, 20, 30, 30]
		int c=0;
		for(int j=0;j<list.size();j++)
		{
			
				
				for(int i=j+1;i<list.size();i++)
				{
					if(list.get(j)==list.get(i))
					{
						c++;
						list.remove(i);
						i--;
					}
				}
				
					System.out.println(list.get(j)+" = "+(c+1));
				
				c=0;			
		}
		
				
	}

}
