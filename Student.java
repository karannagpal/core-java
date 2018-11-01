import java.util.Scanner;

class Student
{
	int rno, marks;
	String name;

	void setData()
	{
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter roll no, name, marks");

	rno = s1.nextInt();
	name = s1.next();
	marks = s1.nextInt();
	}


	void getData()
	{
	System.out.println("Roll no is " + rno);
	System.out.println("name is " + name);
	System.out.println("marks are " + marks);
	System.out.println("------------------------------");
	}


	public static void main(String args[])
	{
	Student obj1 = new Student();
	obj1.setData();
	obj1.getData();

	Student obj2 = new Student();
	obj2.setData();
	obj2.getData();
	}

}