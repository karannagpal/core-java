public class My_Class2 {
	public static void main(String args[]) {
		//instance of outer class
		Outer_Demo outer = new Outer_Demo();

		//instance of inner class
		Outer_Demo.Inner_Demo inner = outer.new Inner_Demo();
		System.out.println(inner.getNum());
	}
}