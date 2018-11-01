import java.util.*;

class E {
	public static void main(String args[]) {
		TreeSet<String> ts = new TreeSet<>();

		ts.add("Panhckula");
		ts.add("Chandigarh");
		ts.add("Mohali");
		ts.add("Zirakpur");

		Iterator<String> itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}

/*
this arranges in ascending order
*/