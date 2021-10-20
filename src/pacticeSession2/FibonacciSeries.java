package pacticeSession2;

import java.util.ArrayList;

public class FibonacciSeries 
{
	//In Fibonacci series, next number is the sum of previous two numbers. 
	//The first two numbers of Fibonacci series are 0 and 1.
	
	//Using Recursion
	
		public static int fibonacciRecursion(int n){
		if(n == 0){
			return 0;
		}
		if(n == 1 || n == 2){
				return 1;
			}
		return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
		}
	    public static void main(String args[]) {
		int maxNumber = 10;
		System.out.print("Fibonacci Series of "+maxNumber+" numbers: ");
		for(int i = 0; i < maxNumber; i++){
				System.out.print(fibonacciRecursion(i) +" ");
			}
		
	

	/*
	public static void main(String[] args) 
	{
		
		ArrayList list=new ArrayList();
		list.add(0);
		//list.add(1);
		int i,j=1,k=0;
		for(i=0; i<100&&j<100;)
		{
			k=i+j;
			i=j;
			j=k;
			if(j<100)
			list.add(j);
		}
		System.out.println(list);
		*/
		
		//by recurssion
		

	}

}
