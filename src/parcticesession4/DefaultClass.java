package parcticesession4;

public class DefaultClass 
{
	//default method and variable
	//default means anywhere access in package
	//but if outside class then class name.obj name or method name req
	//not possible outside of package 
	
		void publicm()                              //non static method
		{
			System.out.println("this is default method");
		}
		int publicv=0;                              //non static variable
		
		static void publicsm()
		{
			System.out.println("this is default static method"); //static method
		}
		static int publicsv;                            //static variable

	public static void main(String[] args) 
	{
		//static
		System.out.println(publicsv);  //static varible direct access
		publicsm();                    //static method direct access
				
		//non static
		DefaultClass AM=new DefaultClass();
		System.out.println(AM.publicv);//NOT STATIC VARIABLE REQ OBJECT CREATION
		AM.publicm();                  //non static method req obj creation
		

	}

}
