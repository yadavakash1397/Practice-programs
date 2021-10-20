package practiceseccion3;

import java.util.Scanner;
//find middle char in string
public class MiddleChar
{
	void midchar(String s)
	{
		System.out.println("midle char: ");
		if(s.length()%2==0)
		{
			System.out.println(s.charAt(((s.length()/2))-1)+""+s.charAt((s.length()/2)));
		}
		else
		{
			System.out.println(s.charAt(s.length()/2));
		}
	}

	public static void main(String[] args) 
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("enter the string");
		MiddleChar c=new MiddleChar();
		c.midchar(reader.next());
		
		
			
		
	}

}
