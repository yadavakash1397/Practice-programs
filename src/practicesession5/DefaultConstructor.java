package practicesession5;
//1)default condtructor
	//A constructor is called "Default Constructor" when it doesn't have any parameter. 
	//If there is no constructor in a class, compiler automatically creates a default constructor.
public class DefaultConstructor 
{
	int a;
	String s;
	void method()
	{
		System.out.println(a);
		System.out.println(s);
	}
	
// The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.
	
	public static void main(String[] args) 
	{
		DefaultConstructor df=new DefaultConstructor();
		
		df.method();

	}

}
