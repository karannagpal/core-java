import java.util.Scanner;

class Student extends Person
{
	int rno, marks;

	void setData()
	{
	super.setData();
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter rno, marks");
	rno = s1.nextInt();
	marks = s1.nextInt();	

	}
	
	void getData()
	{
	super.getData();
	System.out.println("Roll no is: " + rno);
	System.out.println("marks: " + marks);

	}

	public static void main(String args[])
	{
	Student obj1 = new Student();
	obj1.setData();
	obj1.getData();

	}

}