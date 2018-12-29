import java.util.Scanner;

class Employee
{
	int empid, deptt;
	String ename;

	double bsal, hra, ta, da, epf, net;

	void setData()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Employee id, deptt, name, basic salary");
		empid = s1.nextInt();
		deptt = s1.nextInt();
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
		System.out.println("department is " + deptt);
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
		Employee emp[] = new Employee[6];
		
		int i;
		for(i = 0; i <= 5; i++)
		{
			emp[i] = new Employee();
			emp[i].setData();
		}

		for(i = 0; i <= 5; i++)
		{
			emp[i].getData();
		}

		System.out.println("Enter your choice: ");
		System.out.println("1. List name by deptt.");
		System.out.println("2. Calculate total salary of all deptt");
		System.out.println("3. Calculate total salary by deptt");

		Scanner s1 = new Scanner(System.in);
		int choice = s1.nextInt();


		switch(choice)
		{
		case 1:
			System.out.println("People in deptt 1");
			for(i = 0; i <= 5; i++)
			{
				if(emp[i].deptt == 1)
				{
					System.out.println(emp[i].ename);
				}
			}
			
			System.out.println("People in deptt 2");
			for(i = 0; i <= 5; i++)
			{
				if(emp[i].deptt == 2)
				{
					System.out.println(emp[i].ename);
				}
			}
			
			System.out.println("People in deptt 3");
			for(i = 0; i <= 5; i++)
			{
				if(emp[i].deptt == 3)
				{
					System.out.println(emp[i].ename);
				}
			}

			break;
			
		case 2:
			int total_sal = 0;
			for(i = 0; i <= 5; i++)
			{
				total_sal += emp[i].net;
			}
			System.out.println("Total amount paid by company in salaries: " + total_sal);

			break;


		case 3:
			int deptt_sal;

			System.out.println("total salary paid to deptt 1");
			deptt_sal = 0;
			for(i = 0; i <= 5; i++)
			{
				if(emp[i].deptt == 1)
				{
					deptt_sal += emp[i].net;
				}
			}
			System.out.println(deptt_sal);

			System.out.println("total salary paid to deptt 2");
			deptt_sal = 0;
			for(i = 0; i <= 5; i++)
			{
				if(emp[i].deptt == 2)
				{
					deptt_sal += emp[i].net;
				}
			}
			System.out.println(deptt_sal);

			System.out.println("total salary paid to deptt 3");
			deptt_sal = 0;
			for(i = 0; i <= 5; i++)
			{
				if(emp[i].deptt == 3)
				{
					deptt_sal += emp[i].net;
				}
			}
			System.out.println(deptt_sal);
			
			break;


		default:
			System.out.println("Invalid choice.");

		}

	} //end of main function

}