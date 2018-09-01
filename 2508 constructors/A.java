class A
{
	A()
	{
	System.out.println("Default of A");

	}
	
	A(int x)
	{
	System.out.println("square of x is " + (x*x));

	}
	
	A(double x)
	{
	System.out.println("this is decimal");
	
	}

	A(int x, int y)
	{
	System.out.println("sum is " + (x+y));
	
	}

	public static void main(String args[])
	{
	A obj1 = new A();
	A obj2 = new A(10);
	A obj3 = new A(10, 20);
	}

}