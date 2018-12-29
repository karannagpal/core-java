import java.util.Scanner;

class Test implements IA
{
	int num;
	public void setData()
	{
	Scanner s1 = new Scanner(System.in);
	System.out.println("enter num ");
	num = s1.nextInt();
	}

	public void getData()
	{
	System.out.println("num is " + num);
	}

	public static void main(String args[])
	{
	Test obj1 = new Test();
	obj1.setData();
	obj1.getData();
	}
}