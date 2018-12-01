public class StaticNested {
	static class NestedDemo {
		public void my_method() {
			System.out.println("This is my nested class");
		}
	}

	public static void main(String args[]) {
		StaticNested.NestedDemo nested = new StaticNested.NestedDemo();
		nested.my_method();
	}
}