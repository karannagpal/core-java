public class Outer_class {
	public static void main(String args[]) {
		AnonymousInner inner = new AnonymousInner() {
			public void mymethod() {
				System.out.println("This is an example of inner class");
			}
		};
		inner.mymethod();
	}
}