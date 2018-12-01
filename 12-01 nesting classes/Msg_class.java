public class Msg_class {
	//method which accepts the object of interface 'Message'
	public void displayMessage(Message m) {
		System.out.println(m.greet() + ", this is anonymous inner class as an argument.");
	}

	public static void main(String args[]) {
		//instance of class
		Msg_class obj = new Msg_class();

		//passing anonymous inner class as an argument
		obj.displayMessage(new Message() {
			public String greet() {
				return "hello";
			}
		});
	}
}