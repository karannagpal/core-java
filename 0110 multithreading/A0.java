class A0 {
	public static void main(String args[])
	{
		try {
			for(int i = 1; i<=10; i++) {
				System.out.println("i is: " + i);
				Thread.sleep(1000); //in millisecond
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}