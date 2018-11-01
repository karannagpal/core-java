public class Foreach {
		
	public static void main(String args[])
	{
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;

		for(int x : a)
		{
			System.out.println(x);
		}
	}
}