package PatternPrograms;

import java.util.ArrayList;

public class Pattern3 
{
/*
 			 1
           1   1
         1   2   1
       1   3   3   1
     1   4   6   4   1
     
 */
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(j==0||j==i-1)
				{
					System.out.print("1 ");
					list.add(j,1);
				}
				else
				{
					System.out.print((int)list.get(j)+(int)(list.get(j-1)));
					list.add(j, (int)list.get(j)+(int)(list.get(j-1)));
				}
				
			}
			/*for(Object c:list)
			{
				System.out.println(c);

			}*/
				System.out.println();
		}
	}

}
