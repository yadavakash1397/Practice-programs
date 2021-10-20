package practice;

public class StaticKeyword
{
	static int empid=30;
	String empname="testing";
	int deptno=20;
	
//1	Static method can access static variable and method directly without creating object
	static void m1()
	{
		System.out.println("employee id is"+empid);
		m2();
	}
//2  access to non static by using object
	static void m2()
	{
		StaticKeyword sk=new StaticKeyword();
		System.out.println("department no is "+sk.deptno);
		sk.m3();
	}
//3 non static method access static variables and method	
	void m3()
	{
		System.out.println(empid);
		//m1();
		
		System.out.println(empname);
		//m3();
	}
	
	
	
	public static void main(String[] args) 
	{
		m1();
	}

}
