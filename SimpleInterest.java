import java.util.Scanner;

class SimpleInterest
{
	int p, r, t;
	double si, amount;

	void setData()
	{
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter values of p, r, t ");
	p = s1.nextInt();
	r = s1.nextInt();
	t = s1.nextInt();

	si = (p * r * t)/100;
	amount = p + si;

	}

	void getData()
	{
	System.out.println("Simple interest is " + si);
	System.out.println("Amount is " + amount);
	System.out.println("---------------------");

	}

	public static void main(String args[])
	{
	SimpleInterest obj1 = new SimpleInterest();
	obj1.setData();
	obj1.getData();
	}

}