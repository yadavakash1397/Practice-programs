package practice;

interface SS
{
	int m=20;
	int n=40;
	void sum();	
}

interface Sk
{
	int x=20;
	int y=4;
	void mul();	
}

public class Multiple implements SS, Sk
{
	public void sum()
	{
	System.out.println(m+n);
		
	}
	public void mul()
	{
	System.out.println(x*y);	
	}

	public static void main(String[] args) 
	{
		Multiple ml=new Multiple();
		ml.sum();
		ml.mul();

	}

}
