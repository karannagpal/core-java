import java.util.Scanner;

class Rectangle extends Geometry
{
	double length, breadth, area;
	void setData()
	{
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter length, breadth");
	length = s1.nextInt();
	breadth = s1.nextInt();

	}

	void area()
	{
	area = length * breadth;
	System.out.println("area of rectangle is " + area);
	}


}