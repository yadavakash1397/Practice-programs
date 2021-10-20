package practiceSession14.sub;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetP 
{

	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add(100);
		hs.add(200);
		hs.add(100);
		hs.add("akash");
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		
		hs.remove(100);
		System.out.println(hs);
		
		System.out.println(hs.contains(200));	
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());


		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//hs.clear();
		
		
		System.out.println();
		for(Object o:hs)
		{
			System.out.println(o);
		}
	}

}
