import java.util.Scanner;

class Results extends SDetails implements ISports
{
	int tmarks;
	
	void setData()
	{
	super.setData();
	tmarks = marks + smarks;

	}

	void getData()
	{
	super.getData();	
	System.out.println("Total marks are " + tmarks);
	
	}

	public static void main(String args[])
	{
	Result r1 = new Result();
	r1.setData();
	r1.getData();

	}

}