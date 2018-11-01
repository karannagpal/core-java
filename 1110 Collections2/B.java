import java.util.*;
//contains hashmap code
class B
{
	
	public static void main(String args[])
	{
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(104, "Amit");
		hm.put(101, "Sanju");		
		hm.put(102, "Chintu");
		hm.put(103, "Nana");
		hm.put(105, "Anil");
		hm.put(102, "Ranbir");
		hm.put(null, "SRK");
		hm.put(106, null);

		for(Map.Entry m : hm.entrySet())
		{
			System.out.println("key: " + m.getKey() + ", value: " + m.getValue());
		}

	}

}

//notes: order, duplicate key, duplicate value, null key, null value

/*
output is in sorted order (on the basis of key)
duplicate keys are overwritten, most recent value is stored
no key: compile time error
null key: considered, and kept at top (on top of first key)
value can be kept null
*/