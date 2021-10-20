package practice;

public class Student
{
	int SID;
	String Sname;
	int sub1, sub2, sub3;
	void getStuData(int sid, String sNAME)
	{
		SID=sid;
		Sname=sNAME;
		
	}
	
	void GetStuMarks(int a,int b,int c)
	{
		sub1=a;
		sub2=b;
		sub3=c;
	}
	
	void totalmarks()
	{
		System.out.println("total marks are: "+(sub1+sub2+sub3));
	}
	
	void StuInfo()
	{
		System.out.println("STUDENT NAME IS: "+Sname);
		System.out.println("STUDENT id is: "+SID);
	}

	public static void main(String[] args) 
	{
		Student stu1=new Student();
		stu1.getStuData(101, "rohit");
		stu1.GetStuMarks(90,95,90);
		stu1.StuInfo();
		stu1.totalmarks();
		
		
		Student stu2=new Student();
		stu2.getStuData(201,"ranjit");
		stu2.GetStuMarks(80,70,88);
		stu2.StuInfo();
		stu2.totalmarks();

	}

}
