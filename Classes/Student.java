import java.util.Scanner;

class Student
{
	int rno, marks;
	String name;

	void setData()
	{
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter roll no, name, marks");

	rno = s1.nextInt();
	name = s1.next();
	marks = s1.nextInt();

	}


	void getData()
	{
	System.out.println("Roll no is " + rno);
	System.out.println("name is " + name);
	System.out.println("marks are " + marks);
	System.out.println("------------------------------");
	}


	public static void main(String args[])
	{
	Student s[] = new Student[5];

	int i;
	for(i = 0; i <= 4; i++)
	{
		s[i] = new Student();
		s[i].setData();

	}

	for(i = 0; i <= 4; i++)
	{
		s[i].getData();

	}

	
	//search operation ================================
	
	int r;
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter a roll no to search");

	r = s1.nextInt();
	int loc = -1;
	//better than flag

	for(i = 0; i <= 4; i++)
	{
		if(r == s[i].rno)
		{
		loc = i;
		break;
		}
	}

	if(loc == -1)
	{
	System.out.println("Seach unsuccessful");

	}
	else
	{
	System.out.println("Search successful, record found:");
	s[loc].getData();

	}


	//bubble sort operation ===================================

	Student temp = null;

	int pass, step;

	for(pass = 1; pass <= 4; pass++)
	{
		for(step = 0; step < 5-pass; step++)
		{
			if(s[step].rno > s[step+1].rno)
			{		
			temp = s[step];
			s[step] = s[step + 1];
			s[step + 1] = temp;
			}

		}

	}

	
	System.out.println("After sorting:");

	for(i = 0; i <= 4; i++)
	{
		s[i].getData();
	}


	// finding info of topper ================================

	int topper_loc = -1;
	int maxmarks = -1;
	
	for(i = 0; i <= 4; i++)
	{
		if(s[i].marks > maxmarks)
		{
		maxmarks = s[i].marks;
		topper_loc = i;	
		}
	
	}

	System.out.println("info of topper: ");
	s[topper_loc].getData();

	// finding info of least marks ==============================

	int ato_loc = -1;
	int minmarks = 100;
	
	for(i = 0; i <= 4; i++)
	{
		if(s[i].marks < minmarks)
		{
		minmarks = s[i].marks;
		ato_loc = i;
		
		}

	}

	System.out.println("info of student with least marks");
	s[ato_loc].getData();




	} //end of main function






}