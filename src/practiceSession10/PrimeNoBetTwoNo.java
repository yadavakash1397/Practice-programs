
package practiceSession10;

public class PrimeNoBetTwoNo 
{

	public static void main(String[] args) 
	{
		int a=2,b=100,c=0;
		for(int i=a;i<=b;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==0)
			{
				System.out.print(i+" ");
			}
			c=0;
		}
	}

}
