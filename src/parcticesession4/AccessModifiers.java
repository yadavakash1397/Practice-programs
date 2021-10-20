package parcticesession4;

public class AccessModifiers 
{
	//public method and variable
	//public means anywhere access in project
	//but if outside class then class name.obj name or method name req
	//and if outside of package then package import req
	
	public void publicm()                              //non static method
	{
		System.out.println("this is public method");
	}
	public int publicv=0;                              //non static variable
	
	public static void publicsm()
	{
		System.out.println("this is public static method"); //static method
	}
	public static int publicsv;                            //static variable
	
	public static void main(String[] args) 
	{
		//static
		System.out.println(publicsv);  //static varible direct access
		publicsm();                    //static method direct access
		
		//non static
		AccessModifiers AM=new AccessModifiers();
		System.out.println(AM.publicv);//NOT STATIC VARIABLE REQ OBJECT CREATION
		AM.publicm();                  //non static method req obj creation
		
	}

}
