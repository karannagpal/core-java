import java.util.Scanner;
class B
{
	public static void main(String args[])
	{
	
	Scanner s1 = new Scanner(System.in);
	double radius, area;
	System.out.println("Enter radius");
	radius = s1.nextDouble();
	area = 3.14 * radius * radius;
	System.out.println("Area of circle is " + area);

	}

}