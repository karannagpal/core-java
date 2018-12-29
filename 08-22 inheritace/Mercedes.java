import java.util.Scanner;

class Mercedes extends Car
{
	String model;
	int topSpeed;
	
	void setData()
	{
	super.setData();
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter name, top speed ");
	model = s1.next();
	topSpeed = s1.nextInt();
	}

	void getData()
	{
	super.getData();
	System.out.println("model " + name);
	System.out.println("top speed " + topSpeed);
	
	}

	public static void main(String args[])
	{
	Mercedes clk = new Mercedes();
	clk.setData();
	clk.getData();

	}

}