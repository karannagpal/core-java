import java.util.Scanner;

class Human extends Animal
{
	String name;
	
	void setData()
	{
	super.setData();
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter name");	
	name = s1.next();
	}

	void getData()
	{
	super.getData();
	System.out.println("name of human " + name);
	
	}

	public static void main(String args[])
	{
	Human h1 = new Human();
	h1.setData();
	h1.getData();	

	}

}