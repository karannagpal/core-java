class A extends Thread {
	public void run() {
		int i;
		for(i = 0; i <= 10; i++) {
			System.out.println("i is " + i);
		}
	}
}