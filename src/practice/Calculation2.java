package practice;

public class Calculation2 
{
	int sum(int x, int y)
	{
		return(x+y);
	}
	
	int sum(int x, int y, int z)
	{
		return(x+y+z);
	}
	
	double sum(float x, double y)
	{
		return(x+y);
	}
	
	double sum(float x, double y, double z)
	{
		return(x+y+z);
	}


	

	public static void main(String[] args) 
	{
		Calculation2 cal=new Calculation2();
		System.out.println(cal.sum(4,5));
		System.out.println(cal.sum(4,5,6));
		System.out.println(cal.sum(4.5f,5.0));
		System.out.println(cal.sum(4.3f,5.4,6.7));
		


	}

}
