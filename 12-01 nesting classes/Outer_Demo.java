class Outer_Demo {
	int num = 175;

	//inner class
	public class Inner_Demo {
		public int getNum() {
			System.out.println("this is inner class");
			return num;
		}
	}
}