import java.util.Scanner;

class C extends A
{
	// overriding	
	void setData()
	{
	super.setData(); //this calls function of parent class
	System.out.println("setData of C");
	}

	public static void main(String args[])
	{
	C obj1 = new C();
	obj1.setData();

	}

}