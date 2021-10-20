package practiceSession11;

public class parent 
{
	int a;
	void value()
	{
		a=10;
	}
	void display() 
	{
		System.out.println("value of a is "+a);
	}
}

class child extends parent
{
	void value()
	{
		a=20;
	}
	
	void print()
	{
		System.out.println("value of a is "+a);
	}
}


