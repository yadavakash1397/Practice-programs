package practiceSession14.sub;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetP 
{
											
	public static void main(String[] args) 
	{
		TreeSet tr =new TreeSet();
		tr.add(100);
		tr.add(200);
		tr.add(150);
		tr.add(700);
		tr.add(500);
		tr.add(600);
		//tr.add("akash");
		
		//tr.add(null);
		System.out.println(tr);
		System.out.println(tr.size());
		System.out.println(tr.isEmpty());
		System.out.println(tr.contains(100));
		System.out.println(tr.remove(100));
		System.out.println(tr);
		
		tr.pollFirst();//delete first element 
		System.out.println(tr);
		
		tr.pollLast();//delete last element
		System.out.println(tr);
		System.out.println();
		
		Iterator it =tr.iterator();
		
		while(it.hasNext())//print in ascending order using iterator 
		{
			System.out.println(it.next());
		}
		System.out.println();
		
		//tr.clear();
		Iterator dit=tr.descendingIterator();
		
		while(dit.hasNext())// print in descending order using iterator
		{
			System.out.println(dit.next());
		}
		System.out.println();
			
		for(Object o:tr)
		{
			System.out.println(o);
		}
		

	}

}
