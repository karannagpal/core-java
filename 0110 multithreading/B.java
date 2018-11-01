class B extends Thread {
	public void run() {
		int j;
		for(j = 1; j <= 10; j++) {
			System.out.println("j is " + j);
		}
	}
}