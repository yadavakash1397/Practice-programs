package practiceSession7;

public class PatternPrograms 
{
/*Q.1] write program for below pattern
*
* *
* * *
* * * *
*/

	public static void main(String[] args) 
	{
		/*
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
/*	Q.2] write program for below pattern
	* * * *
	* * *
	* *
	*
*/
		/*
		for(int i=1;i<=4;i++)
		{
			for(int j=i;j<=4;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
/*		
	Q.3] 
	#
	# # 
	# # #
	# # # #
	# # #
	# #
	#
*/
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("# ");
			}
			System.out.println();
		}
		for(int i=1;i<=3;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print("# ");
			}
			System.out.println();
		}
	}	
}
