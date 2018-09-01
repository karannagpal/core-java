import java.util.Scanner;

class Student
{
	int rno, marks;
	String name;
	
	Student()
	{
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter rno, name and marks");
	rno = s1.nextInt();
	name = s1.next();
	marks = s1.nextInt();

	//this constructor is more of like setData()	

	}

	void getData()
	{
	System.out.println("roll no is " + rno);
	System.out.println("name is " + name);
	System.out.println("marks are " + marks);

	}
	

	public static void main(String args[])
	{
	Student obj = new Student();
	obj.getData();

	}
}