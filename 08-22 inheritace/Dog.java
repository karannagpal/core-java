import java.util.Scanner;

class Dog extends Animal
{
	String breed;
	
	void setData()
	{
	super.setData();
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter breed");	
	breed = s1.next();
	}

	void getData()
	{
	super.getData();
	System.out.println("breed of dog " + breed);
	
	}



}