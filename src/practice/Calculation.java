package practice;

public class Calculation 
{
	int a,b,c;                                                                                                                 
	Calculation(int A, int B, int C)
	{
		a=A;
		b=B;
		c=C;
	}
	void Sum()
	{
		System.out.println("sum is "+(a+b+c));
	}

	public static void main(String[] args) 
	{
		Calculation cal= new Calculation(10,20,30);
		cal.Sum();

	}

}
