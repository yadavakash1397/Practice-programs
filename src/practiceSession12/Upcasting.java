package practiceSession12;

public class Upcasting 
{

	public static void main(String[] args) 
	{
		parent o=new child();//upcasted
		o.money();
		/*
		 means parent access his own properties and properties which are overridden in child class
		 */
	}

}
