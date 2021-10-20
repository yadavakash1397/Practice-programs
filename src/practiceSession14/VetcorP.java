package practiceSession14;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VetcorP 
{

	public static void main(String[] args) 
	{
		Vector vt=new Vector();
		System.out.println(vt.capacity());//bydefalt capacity is 10 and automatically doubles when exceeds than 10
		vt.add(100);
		vt.add("akash");
		vt.add('n');
		vt.add(null);
		System.out.println(vt);
		System.out.println();
		
		//fetch data using enumeration
		System.out.println("fetch data using enumeration");
		Enumeration en=vt.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		System.out.println();
		
		//fetch data using list iterator		
		System.out.println("fetch data using list iterator");
		ListIterator lst=vt.listIterator();
		
		while(lst.hasNext())
		{
			System.out.println(lst.next());
		}
		System.out.println();
		
		
		//fetch data using Iterator
		System.out.println("fetch data using Iterator");
		Iterator it=vt.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println();
		
		//fetch using for each loop
		System.out.println("fetch using for each loop");
		for(Object o:vt)
		{
			System.out.println(o);
		}
		System.out.println();
		
		//fetch using for loop
		System.out.println("fetch using for loop");
		for(int i=0;i<=vt.size()-1;i++)
		{
			System.out.println(vt.get(i));
		}
		
		
		
		
		
		
		

	}

}
