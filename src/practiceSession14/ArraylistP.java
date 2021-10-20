package practiceSession14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistP
{

	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		list.add(100);
		list.add("akaash");
		list.add('c');
		list.add(null);
		System.out.println(list);
		System.out.println();
		
		//data fetching using for loop
		System.out.println("data fetching using for loop");
		for(int i=0;i<=list.size()-1;i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println();
		
		//data fetch using foreach loop
		System.out.println("data fetch using foreach loop");
		for(Object o:list)
		{
			System.out.println(o);
		}
		System.out.println();
		
		//data fetch using list iterator
		System.out.println("data fetch using list iterator");
		ListIterator ls=list.listIterator();
		while(ls.hasNext())
		{
			System.out.println(ls.next());
		}
		System.out.println();
		
		//data fetch using iterator
		System.out.println("data fetch using iterator");
		Iterator it=list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
