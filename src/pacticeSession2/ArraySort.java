package pacticeSession2;

import java.util.ArrayList;

public class ArraySort 
{

	public static void main(String[] args) 
	{
		//int a[]= {1,2,1,2,3,4,6,5,4};
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(10);
		list.add(20);
		list.add(30);
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
		System.out.println(list);
		
		
	}

}
