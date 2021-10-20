package parcticesession4;

public class DefaultClasssub 
{
    //default is accessible in other class in same package
	public static void main(String[] args) 
	{
		//static
		System.out.println(DefaultClass.publicsv);  //static varible direct access
		DefaultClass.publicsm();                    //static method direct access
						
		//non static
		DefaultClass AM=new DefaultClass();
		System.out.println(AM.publicv);//NOT STATIC VARIABLE REQ OBJECT CREATION
		AM.publicm();                  //non static method req obj creation
				

	}

}
