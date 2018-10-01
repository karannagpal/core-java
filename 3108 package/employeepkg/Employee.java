package employeepkg;

import java.util.Scanner;
import personpkg.Person;

public class Employee extends Person
{
	int empid;

	Double bsal, hra, ta, da, epf, net;

	public void setData()
	{
		super.setData();

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Employee id, basic salary");
		empid = s1.nextInt();
		bsal = s1.nextDouble();
		
		hra = (bsal*10)/100;
		ta = (bsal*11)/100;
		da = (bsal*9)/100;
		epf = (bsal*10)/100;
		net = (bsal + hra + ta + da - epf);
	}

	public void getData()
	{
		super.getData();

		System.out.println("----------------------");
		System.out.println("emp id is " + empid);
		System.out.println("basic salary is " + bsal);
		System.out.println("HRA is " + hra);
		System.out.println("TA is " + ta);
		System.out.println("DA is " + da);
		System.out.println("EPF is " + epf);
		System.out.println("Net salary = " + net);
		System.out.println("----------------------");
	}

}