import java.util.Scanner;

class Animal
{
	int legs, hands;
	
	void setData()
	{
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter hands, legs");	
	hands = s1.nextInt();
	legs = s1.nextInt();

	}

	void getData()
	{
	System.out.println("hands " + hands);
	System.out.println("legs " + legs);	
	}


}