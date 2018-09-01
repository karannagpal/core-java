class C
{
	C()
	{
	System.out.println("Default of C");

	}

	C(int x)
	{
	this();  //this calls default constructor
	System.out.println("x is " + x);	

	}

	C(int x, int y)
	{
	this(x);  //this calls second varient of constructor
	System.out.println("sum is " + (x+y));

	}

	public static void main(String args[])
	{
	C obj = new C(10, 5);

	}


}