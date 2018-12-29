import java.util.Scanner;

class Pet extends Dog
{
	String name, owner;
	
	void setData()
	{
	super.setData();
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter name, owner");	
	name = s1.next();
	owner = s1.next();
	}

	void getData()
	{
	super.getData();
	System.out.println("Name of the pet " + name);
	System.out.println("owner " + owner);
	
	}

	public static void main(String args[])
	{
	Pet p1 = new Pet();
	p1.setData();
	p1.getData();
	}

}