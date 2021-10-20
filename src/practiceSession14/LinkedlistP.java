package practiceSession14;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedlistP 
{

	public static void main(String[] args)
	{
		LinkedList ll=new LinkedList();
		ll.add(100);
		ll.add("akash");
		ll.add(null);
		ll.add(100);
		ll.add(null);
		ll.add("akash");
		ll.add(500);
		System.out.println(ll);
		
		ll.remove(null);
		System.out.println(ll);
		
		System.out.println(ll.size());
		System.out.println(ll.get(2));
		System.out.println(ll.isEmpty());
		System.out.println(ll.contains("akash"));
		
		System.out.println(ll);
		System.out.println();
		
		System.out.println("using iterator");
		Iterator it=ll.iterator();	
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println();
		
		System.out.println("using list iterator");
		ListIterator lst=ll.listIterator();
		while(lst.hasNext())
		{
			System.out.println(lst.next());
		}
		
		System.out.println();
		
		System.out.println("using for each loop");
		
		for(Object o:ll)
		{
			System.out.println(o);
		}
		
		System.out.println("using for loop");
		
		for(int i=0;i<=ll.size()-1;i++) 
		{
			System.out.println(ll.get(i));
		}
		System.out.println("");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
