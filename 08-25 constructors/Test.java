import java.util.Scanner;
class Test implements IC
{
	int a;
	public void setData()
	{
	Scanner s1 = new Scanner(System.in);
	System.out.println("enter side");
	a = s1.nextInt();

	}

	public void getData()
	{
	System.out.println("side is " + a);
	}

	public void area()
	{
	System.out.println("Area of square is " + (a*a));
	}

	public void volume()
	{
	System.out.println("Volume of such cube is " + (a*a*a));
	}

	public static void main(String args[])
	{
	Test obj = new Test();
	obj.setData();
	obj.getData();
	obj.area();
	obj.volume();	
	}
}