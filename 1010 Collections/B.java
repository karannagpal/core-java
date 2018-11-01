import java.util.*;
//contains linked list
class B {
	public static void main(String args[]) {
		LinkedList<String> ll = new LinkedList<>();
		
		ll.add("C");
		ll.add("C++");
		ll.add("Java");
		ll.add("Python");
		
		Iterator<String> itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

/* 
properties of linked list:

maintains the insertion order
duplicates can exist
*/