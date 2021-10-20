package PatternPrograms;

public class Pattern1 
{/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 

*/

	public static void main(String[] args) 
	{
		int max=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=max;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			max++;
		}
	}

}
