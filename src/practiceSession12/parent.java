package practiceSession12;

public class parent 
{
	int a=20;
	void money()
	{
		System.out.println(a);
	}
}

class child extends parent
{
	void money()
	{
		a=a*2;
		System.out.println(a);
	}
	
}