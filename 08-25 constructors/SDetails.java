import java.util.Scanner;

class SDetails extends Student
{
	int marks;
	
	void setData()
	{
	super.setData();
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter marks");
	marks = s1.nextInt();

	}
	
	void getData()
	{
	super.getData();
	System.out.println("marks are " + marks);

	}

}