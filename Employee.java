import java.util.Scanner;

class Employee
{
	int empid;
	String ename;

	Double bsal, hra, ta, da, epf, net;

	void setData()
	{
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter Employee id, name, basic salary");
	empid = s1.nextInt();
	ename = s1.next();
	bsal = s1.nextDouble();
	hra = (bsal*10)/100;
	ta = (bsal*11)/100;
	da = (bsal*9)/100;
	epf = (bsal*10)/100;

	net = (bsal + hra + ta + da - epf);

	}

	void getData()
	{
	System.out.println("emp id is " + empid);
	System.out.println("emp name is " + ename);
	System.out.println("basic salary is " + bsal);
	System.out.println("HRA is " + hra);
	System.out.println("TA is " + ta);
	System.out.println("DA is " + da);
	System.out.println("EPF is " + epf);
	System.out.println("Net salary = " + net);
	System.out.println("----------------------");
	}
	
	public static void main(String args[])
	{
	Employee obj1 = new Employee();
	obj1.setData();
	obj1.getData();

	Employee obj2 = new Employee();
	obj2.setData();
	obj2.getData();
	}




}