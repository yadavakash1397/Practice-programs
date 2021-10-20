package practicesession5;

//Constructor overloading in Java is a technique of having more than one constructor with different parameter lists. 
//They are arranged in a way that each constructor performs a different task. 
//They are differentiated by the compiler by the number of parameters in the list and their types.

public class ConstructorOverloading 
{
	int id,age;
	String name;
	ConstructorOverloading(int i,String s,int a)
	{
		id=i;
		age=a;
		name=s;
	}
	
	ConstructorOverloading(int i,String s)
	{
		id=i;
		name=s;
	}
	
	void display()
	{
		System.out.println(id+" "+age+" "+name);
	}

	public static void main(String[] args) 
	{
		ConstructorOverloading co=new ConstructorOverloading(10,"akash",23);
		co.display();
		ConstructorOverloading co2=new ConstructorOverloading(20,"ranjit");
		co2.display();
	}

}
