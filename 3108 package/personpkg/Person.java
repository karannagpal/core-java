package personpkg;

import java.util.Scanner;

public class Person
{
	String name, address;

	public void setData()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter name, address");

		name = s1.next();
		address = s1.next();
	}

	public void getData()
	{
		System.out.println("name is " + name);
		System.out.println("address is " + address);
	}
}