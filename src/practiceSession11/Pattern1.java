package practiceSession11;

public class Pattern1 
{
	/*
	 
	 * * * * *
	 * * * *
	 * * *
	 * *
	 * 
	 
	 */

	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			//for(int j=1;j<=(6-i);j++)
			//for(int j=i;j<=5;j++)
			for(int j=5;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
