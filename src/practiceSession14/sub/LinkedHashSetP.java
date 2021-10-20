package practiceSession14.sub;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetP 
{

	public static void main(String[] args)
	{
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(100);
		lhs.add(200);
		lhs.add(100);
		lhs.add("akash");
		lhs.add('a');
		lhs.add(null);
		lhs.add(null);	
		System.out.println(lhs);
		
		lhs.remove(100);
		System.out.println(lhs);
		
		System.out.println(lhs.size());
		System.out.println(lhs.contains(200));
		System.out.println(lhs.isEmpty());
		System.out.println();
		
		Iterator it =lhs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//lhs.clear();
		
		System.out.println();
		for(Object o:lhs)
		{
			System.out.println(o);
		}
		
		
	}

}
