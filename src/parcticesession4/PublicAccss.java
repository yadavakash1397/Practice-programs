package parcticesession4;

public class PublicAccss 
{
	//AccessModifiers class from parcticesession4 package
	

	public static void main(String[] args) 
	{
		//static
		System.out.println(AccessModifiers.publicsv);  ////static varible direct access but class name req bcoz outside class 
		AccessModifiers.publicsm();                    //static method direct access but class name req bcoz outside class
				
		//non static
		AccessModifiers AM=new AccessModifiers();
		System.out.println(AM.publicv);//NOT STATIC VARIABLE REQ OBJECT CREATION
		AM.publicm();                  //non static method req obj creation

	}

}
