package practiceSession15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class CollectionP 
{
//program for remove duplicate and sort arraylist
	public static void main(String[] args) 
	{
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(15);
		ar.add(10);
		//arraylist contains 
		System.out.println(ar);
		
		
		System.out.println("print element in ascending order and removing duplicates");
		TreeSet tr=new TreeSet(ar);
		//System.out.println(tr);
		Iterator it=tr.iterator();
		/*
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
		ArrayList ar2=new ArrayList(tr);
		//System.out.println(ar2);
		ar=ar2;
		System.out.println(ar);
		
		System.out.println();
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(30);
		hs.add(15);
		hs.add(5);
		System.out.println(hs);
		
		
		
		
		
		
		
		
		

	}

}
