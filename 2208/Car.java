import java.util.Scanner;

class Car extends Vehicle
{
	String name, color;
	int doors;
	
	void setData()
	{
	super.setData();
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter name, color, doors");	
	color = s1.next();
	doors = s1.nextInt();
	}

	void getData()
	{
	super.getData();
	System.out.println("name " + name);
	System.out.println("color " + color);
	System.out.println("doors " + doors);
	
	}

}