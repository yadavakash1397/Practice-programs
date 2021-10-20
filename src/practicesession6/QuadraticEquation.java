package practicesession6;

import java.util.Scanner;

public class QuadraticEquation 
{
	static double x,y,z;
	 void AnswerEquation(int a, int b,int c)
	{		
		double answer1,answer2;
		answer1=((-b)+sqroot((b*b)-(4*a*c)))/(2.0*a);
		answer2=((-b)-sqroot((b*b)-(4*a*c)))/(2.0*a);
		
				
		System.out.print("the values of quadratric equation are ");		
		System.out.printf("%.3f",answer1);
		System.out.printf("&"+"%.3f",answer2);
	}
	 
	 static float sqroot(int x)
		{
			float a=x;
			float i;
			for( i=1;(i*i)<=a;i=i+0.000001f);
			return(i);
		}
	 
	 
	 

	public static void main(String[] args)
	{
		Scanner reader=new Scanner(System.in);
		QuadraticEquation qe=new QuadraticEquation();
		System.out.println("enter values");
		qe.AnswerEquation(reader.nextInt(),reader.nextInt(),reader.nextInt());
		
		

	}

}
