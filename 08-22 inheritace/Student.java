import java.util.Scanner;

class Student extends Person
{
	int rno, marks;

	void setData()
	{
	super.setData();

	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter rollno, marks");
	rno = s1.nextInt();
	marks = s1.nextInt();
	}

	void getData()
	{
	super.getData();
	System.out.println("roll no is " + rno);
	System.out.println("marks are " + marks);
	
	}

	public static void main(String args[])
	{
	Student s1 = new Student();
	s1.setData();
	s1.getData();
	}

}