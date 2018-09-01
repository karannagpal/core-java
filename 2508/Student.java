import java.util.Scanner;

class Student
{
	int rno;
	String name;
	
	void setData()
	{
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter roll no and name");
	rno = s1.nextInt();
	name = s1.next();		

	}
	
	void getData()
	{
	System.out.println("roll no is " + rno);
	System.out.println("name is " + name);
	
	}

}