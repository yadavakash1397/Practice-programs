package PatternPrograms;

public class Pattern2
{

	public static void main(String[] args) 
	{
		int max=1,n=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=max;j++)
			{
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
			max++;
		}
	}

}
