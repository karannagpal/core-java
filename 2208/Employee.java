import java.util.Scanner;

class Employee extends Person
{
	int empid, sal;

	void setData()
	{
	super.setData();

	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter empid, salary for employee");
	empid = s1.nextInt();
	sal = s1.nextInt();
	}

	void getData()
	{
	super.getData();
	System.out.println("empid is " + empid);
	System.out.println("salary is " + sal);
	}

	public static void main(String args[])
	{
	Employee e1 = new Employee();
	e1.setData();
	e1.getData();
	}

}