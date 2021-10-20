package practice;

public class ArrayndstringAssignment 
{

	public static void main(String[] args) 
	{
		//sum of values of arrays
		
		/*
		int b=0;
		int a[]= {10,20,30,40,50,60,70};
		for(int i=0;i<a.length;i++)
		{
			b=b+a[i];
		}
		System.out.println("sum of array is "+b);
		*/
		
		//search specific no in array
		/*
		int a[]= {10,20,30,40,30};
		int b=90,c=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(b==a[i])
			{
				System.out.println("no is found at index a["+i+"]");
				c++;
			}
		}
		if(c==0)
		{
			System.out.println("no not found");
		}*/
		
		//search string in array
		
		/*
		String a[]={"yogesh","ranjit","akash","rohan","akash"};
		String s="akash";
		int c=0;
		for(int i=0;i<a.length;i++)
		{
		if(a[i].equals(s))
		{
			System.out.println("found at "+i);
			c++;
		}
		}
		if(c==0)
		{
			System.out.println("not found");
		}
		*/
		
		//even and odd no in array
		
		/*
		int a[]= {101,202,303,404,505
				};
		System.out.println("even no are");
		for(int i=0;i<=a.length-1;i++)			
		{
			
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
			
		}
		System.out.println("odd no are");
		for(int i=0;i<=a.length-1;i++)
		{
		
		if(a[i]%2==1)
		{
			System.out.println(a[i]);
		}
		}
		*/
		
		//greatest no in array
		
		/*
		int a[]= {50,20,30,40,500};
		int b=a[0];
		int c=a[0];
		for(int i=1;i<=a.length-1;i++)
		{
			if(b>a[i])
			{
				b=a[i];
			}
			if(c<a[i])
			{
				c=a[i];
			}
		}
		System.out.println("smallest no is "+b);
		System.out.println("largest no is "+c);
		
		*/
		
		//add two matrices
		
		int a[][]= {{10,20},{40,50,60},{70,80,90}};
		int b[][]= {{100,20,30},{44,56,60},{70,90,88}};
		if((a.length==b.length)&&(a[0].length==b[0].length))
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=a[i][j]+b[i][j];
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");

		}
		else
		{
			System.out.println("check row and columns  of both matrices are same");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
