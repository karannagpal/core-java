class Test2 {
	public static void main(String args[]) {
		D obj1 = new D();
		//obj1.start();
		Thread t1 = new Thread(obj1);
		t1.start();
	}
}