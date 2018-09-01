import java.util.Scanner;

class E extends D
{
	void setData()
	{
	//this gives compile time error

	System.out.println("setData of E");
	}

	public static void main()
	{
	E obj1 = new E();
	obj1.setData();
	}

}