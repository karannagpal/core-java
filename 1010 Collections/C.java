import java.util.*;
//contains hashset
class C {
	public static void main(String args[]) 	{
		HashSet<String> hs = new HashSet<>();

		hs.add("Panhckula");
		hs.add("Chandigarh");
		hs.add("Mohali");
		hs.add("Zirakpur");

		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

/* 
properties of hash set:

doesn't maintains insertion order
duplicates don't exist
*/