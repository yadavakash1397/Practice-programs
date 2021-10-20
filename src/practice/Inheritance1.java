package practice;

 class Teacher 
{
	int id=1;
final String Collegename="yogeshclg";
String Designation="hod";
void Does()
{
	System.out.println("teaching");
}
}

class ComputerTeacher extends Teacher
{
	//int id=2;
	String Collegename="hjh";
	void Does()
	{
		super.Does();
		System.out.println("teaching...........................");
		System.out.println(Collegename+" "+Designation+id);
	}
}

public class Inheritance1 
{
	

	public static void main(String[] args) 
	{
		ComputerTeacher ct = new ComputerTeacher();
		ct.Does();
		ct.id=20;

	}

}

