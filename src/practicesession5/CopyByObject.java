package practicesession5;

//we can copy the values from one object to another

public class CopyByObject 
{
	int no;
	String sd;
	CopyByObject(int a,String s)
	{
		no=a;
		sd=s;
	}
	
	CopyByObject(CopyByObject c)
	{
		no=c.no;
		sd=c.sd;
	}
	
	void display()
	{
		System.out.println(no+" "+sd);
	}

	public static void main(String[] args) 
	{
		CopyByObject cb1=new CopyByObject(12,"akash");
		cb1.display();
		
		CopyByObject cb2=new CopyByObject(cb1);
		cb2.display();

	}

}
