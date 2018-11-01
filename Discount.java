import java.util.Scanner;

class Discount
{
	int total, qty;
	double discount, finalamount;
	
	void setData()
	{
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter total, qty");
	total = s1.nextInt();
	qty = s1.nextInt();
	
	if(qty > 10)
	{
		discount = (total * 10)/100;
	}
	else
	{
		discount = (total * 1)/100;		
	}
	finalamount = total - discount;	

	}


	void getData()
	{
	System.out.println("Total is " + total);
	System.out.println("qty is " + qty);
	System.out.println("discount is " + discount);
	System.out.println("Final amount after discount is " + finalamount);
	System.out.println("----------------");

	}


	public static void main(String args[])
	{
	Discount obj1 = new Discount();
	obj1.setData();
	obj1.getData();

	Discount obj2 = new Discount();
	obj2.setData();
	obj2.getData();
	}



}
