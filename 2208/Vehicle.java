import java.util.Scanner;

class Vehicle
{
	int wheels, seats;
	
	void setData()
	{
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter wheels, seats");	
	wheels = s1.nextInt();
	seats = s1.nextInt();
	}

	void getData()
	{
	System.out.println("Wheels in vehicle " + wheels);
	System.out.println("seats " + seats);
	
	}
}