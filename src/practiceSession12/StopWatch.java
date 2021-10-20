package practiceSession12;

public class StopWatch
{

	public static void main(String[] args) throws InterruptedException 
	{
		int a=5;
		for(int i=a;i>=1;i--)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}

	}

}
