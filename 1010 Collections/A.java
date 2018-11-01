import java.util.*;
//contins array list 
class A {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<>();
		
		al.add("C");
		al.add("C++");
		al.add("Java");
		al.add("Python");
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

/* 
properties of array list:

maintains the insertion order
duplicates can exist

faster access if number is known
i.e. if we want 34th value, we ask for al[33] directly
*/