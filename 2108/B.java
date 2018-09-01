import java.util.Scanner;

class B extends A
{
	void getData()
	{
	System.out.println("getData of B");
	}

	public static void main(String args[])
	{
	B obj1 = new B();
	obj1.setData();
	obj1.getData();
	}

}