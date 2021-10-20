package parcticesession4;

public class PrivateClass 
{
		//it is private 
		//private method and variable
		//private means anywhere access in class not outside class
		
		
		private void publicm()                              //non static method
		{
			System.out.println("this is public method");
		}
		private int publicv=0;                              //non static variable
		
		private static void publicsm()
		{
			System.out.println("this is public static method"); //static method
		}
		private static int publicsv;                            //static variable
		
	public static void main(String[] args) 
	{
		//static
		System.out.println(publicsv);  //static varible direct access
		publicsm();                    //static method direct access
				
		//non static
		PrivateClass AM=new PrivateClass();
		System.out.println(AM.publicv);//NOT STATIC VARIABLE REQ OBJECT CREATION
		AM.publicm();                  //non static method req obj creation
		

	}

}
