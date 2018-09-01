import java.util.Scanner;

class Circle extends Geometry
{
	double radius, area;
	void setData()
	{
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter radius");
	radius = s1.nextInt();
	}

	void area()
	{
	area = 3.14 * radius * radius;
	System.out.println("area of circle is " + area);
	}


}