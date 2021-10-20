package practice;

public interface Akash 
{
	int a=20;
	int b=30;
	void sum();
}

class B implements Akash
{
	public void sum()
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) 
	{
		B obj=new B();
		obj.sum();
		
	}
}

