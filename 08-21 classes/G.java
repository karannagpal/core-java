import java.util.Scanner;

class G extends F
{
	// this again gives compile time error
	// cannot inherit a final class
	void setData()
	{
	System.out.println("setData of G");
	}
	
	public static void main(String args[])
	{
	G obj = new G();
	obj.setData();
	}

}