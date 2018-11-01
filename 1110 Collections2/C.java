import java.util.*;
//contains hashtable
class C
{
	
	public static void main(String args[])
	{
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(104, "Mouse");
		ht.put(105, "Speaker");
		ht.put(101, "CPU");
		ht.put(102, "Keyboard");
		ht.put(103, "Display");
		ht.put(106, "Printer");
		ht.put(106, null);

		for(Map.Entry m : ht.entrySet())
		{
			System.out.println("key: " + m.getKey() + ", value: " + m.getValue());
		}

	}
	
}

//remember: Hashtable, not HashTable
//notes: order, duplicate key, duplicate value, null key, null value

/*
order: random
duplicate keys are overwritten, most recent value is stored
no key: compile time error
null key: runtime error
null in value causes runtime error
*/
