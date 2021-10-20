package parcticesession4sub;

import parcticesession4.ProtectedClass;

public class ProtectedClass2 extends ProtectedClass
{

	public static void main(String[] args) 
	{
		sums();
		System.out.println(prots);
		ProtectedClass2 pc=new ProtectedClass2();
		pc.sum();
		System.out.println(pc.prot);

	}

}
