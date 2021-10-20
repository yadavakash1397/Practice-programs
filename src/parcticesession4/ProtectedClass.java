package parcticesession4;

public class ProtectedClass
{
	//in protected we can use outside of package but by using inheritance means by extending class
	//inside package inheritance not req
	protected static void sums()
	{
		System.out.println("protected static");
	}
	
	protected static int prots=2;
	
	protected  void sum() 
	{
		System.out.println("protected");
	}
	protected static int prot=4;
	

	public static void main(String[] args) 
	{
		sums();
		System.out.println(prots);
		ProtectedClass pc=new ProtectedClass();
		pc.sum();
		System.out.println(prot);
	}

}
