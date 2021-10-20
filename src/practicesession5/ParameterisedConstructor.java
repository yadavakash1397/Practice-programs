package practicesession5;

//2)Java Parameterized Constructor
	//A constructor which has a specific number of parameters is called a parameterized constructor.
	//The parameterized constructor is used to provide different values to distinct objects. 
	//However, you can provide the same values also.
public class ParameterisedConstructor
{
	int id; 
	String name;
	ParameterisedConstructor(int i,  String n)
	{
		id=i;
		name=n;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) 
	{
		ParameterisedConstructor pc=new ParameterisedConstructor(10,"akash");
		pc.display();

	}

}
