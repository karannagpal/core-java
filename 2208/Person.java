import java.util.Scanner;

class Person
{
	String name, address;

	void setData()
	{
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter name, address for person");
	name = s1.next();
	address = s1.next();
	}

	void getData()
	{
	System.out.println("name is " + name);
	System.out.println("Address: " + address);
	}

}