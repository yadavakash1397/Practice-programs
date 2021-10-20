package practiceseccion3;

import java.text.DecimalFormat;
import java.util.Scanner;

//calculate rate of interest

public class MonthInterest 
{
	static void interest(float am,int yr,int roi)
	{
		DecimalFormat df=new DecimalFormat("#.##");        //how to print decimal values roundup
		float r=roi/12.0f;
		float sum=am;
		System.out.println("yr ammount");
		for(int i=1;i<=yr;i++)
		{
			for(int j=1;j<=12;j++)
			{
				sum=sum+(sum*r/100);
			}
			System.out.println(i+"  "+df.format(sum));
			//System.out.printf(i+"  "+"%.2f",sum);             //printf for formatted op 
		}
	}

	public static void main(String[] args)
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("enter amount");
		float amount=reader.nextFloat();
		
		System.out.println("enter year");
		int year=reader.nextInt();
		
		System.out.println("enter rate of interest");
		int ROI=reader.nextInt();
		
		interest(amount,year,ROI);

	}

}
