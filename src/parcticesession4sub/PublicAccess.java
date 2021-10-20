package parcticesession4sub;

import parcticesession4.AccessModifiers;

//AccessModifiers class from parcticesession4 package
public class PublicAccess 
{

	public static void main(String[] args) 
	{
		//static
			System.out.println(AccessModifiers.publicsv);//static varible direct access but class name req bcoz outside class and package
			AccessModifiers.publicsm();                  //static method direct access but class name req bcoz outside class and package
				
			//non static
			AccessModifiers AM=new AccessModifiers();
			System.out.println(AM.publicv);//NOT STATIC VARIABLE REQ OBJECT CREATION
			AM.publicm();                  //non static method req obj creation

	}

}
