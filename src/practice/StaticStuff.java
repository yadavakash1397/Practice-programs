package practice;

public class StaticStuff 
{
	int id;
	static int dptno=20;
	String name;
	String role;

	public static void main(String[] args) 
	{
		StaticStuff ss=new StaticStuff();
		ss.id=50;
		ss.dptno=70;
		ss.name="ashfkjas0";
		ss.role="engineer";
		System.out.println(ss.id+" "+dptno+" "+ss.name+" "+ss.role);
		
		StaticStuff st=new StaticStuff();
		st.id=60;
		st.dptno=90;
		st.name="eeeee";
		st.role="helper";
		System.out.println(st.id+" "+dptno+" "+st.name+" "+st.role);
		
		System.out.println(ss.id+" "+dptno+" "+ss.name+" "+ss.role);


	}

}
