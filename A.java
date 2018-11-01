import java.util.Scanner;

class A
{
	public static void main(String args[])
	{
	
	Scanner s1 = new Scanner(System.in); //scanner will take input from keyboard
	int a, b, c;
	System.out.println("Enter 2 numbers");
	a = s1.nextInt();
	b = s1.nextInt();

	c = a + b;
	System.out.println("Sum is " + c);

	}

}