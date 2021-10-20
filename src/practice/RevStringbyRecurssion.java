package practice;

import java.util.Scanner;

public class RevStringbyRecurssion 
{
	static String a="";

	static String rev(String s)
	{
		//static String a="";
		if(s.length()==0)
		{
			return(null);
		}
		
		StringBuilder sb = new StringBuilder(a);
	    sb.insert(a.length(),s.charAt(s.length()-1));
	    a=sb.toString();
		
		
	    
	    
		//System.out.print(s.charAt(s.length()-1));
		rev(s.substring(0,s.length()-1));
		
		return(a);
		
	}

	public static void main(String[] args) 
	{
		Scanner reader=new Scanner (System.in);
		System.out.println("enter string to reverse");
		String s=reader.nextLine();
		//rev(s);
		
		/*
		 String a="";
		StringBuilder sb = new StringBuilder(a);
	    sb.insert(a.length(),'a');
	    a=sb.toString();
	    System.out.println(a+"k");
	    */
		System.out.println(rev(s));
	}

}
