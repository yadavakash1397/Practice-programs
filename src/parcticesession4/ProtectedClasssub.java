package parcticesession4;

public class ProtectedClasssub 
{

	public static void main(String[] args) 
	{
		ProtectedClass.sums();
		System.out.println(ProtectedClass.prots);
		ProtectedClass pc=new ProtectedClass();
		pc.sum();
		System.out.println(pc.prot);

	}

}
