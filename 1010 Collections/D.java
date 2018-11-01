import java.util.*;
//contains linked hashset
class D {
	public static void main(String args[])	{
		LinkedHashSet<String> lhs = new LinkedHashSet<>();

		lhs.add("Panhckula");
		lhs.add("Chandigarh");
		lhs.add("Mohali");
		lhs.add("Zirakpur");

		Iterator<String> itr = lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

/* 
properties of linked hashset:

maintains insertion order
duplicates don't exist
*/