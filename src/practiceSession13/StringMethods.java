package practiceSession13;

public class StringMethods 
{

	public static void main(String[] args) 
	{
		String s1="akash";
		String s2="yadav";

		//----contaminate two strings-----

		System.out.println(s1.concat(s2));  

		//----Compare two strings-----

		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contains(s2));

		//----change case-------------

		System.out.println(s1.toUpperCase());   
		System.out.println(s1.toLowerCase());

		//----length of string--------

		System.out.println(s1.length());

		///----find char------
		System.out.println(s1.charAt(3));

		//-----find index-----
		System.out.println(s1.indexOf("k"));
		System.out.println(s1.lastIndexOf("k"));

		//-----substring--------
		System.out.println(s1.substring(0,3));

		//-----startswith and endswith------
		System.out.println(s1.startsWith("a"));
		System.out.println(s1.endsWith("h"));

		//-----empty---------
		System.out.println(s1.isEmpty());

		//-----replace-----
		System.out.println(s1.replace('a','u'));
				
	}

}
