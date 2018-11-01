import java.util.*;
//contains tree map code
class A
{
	
	public static void main(String args[])
	{
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(104, "Anushka");
		tm.put(101, "Alia");
		tm.put(102, "Priyanka");
		tm.put(103, "Deepika");
		tm.put(105, "Katrina");
		//tm.put(null, "Parineeti");
		tm.put(106, null);

		for(Map.Entry m : tm.entrySet())
		{
			System.out.println("key: " + m.getKey() + ", value: " + m.getValue());
		}

	}

	
}

//notes: order, duplicate key, duplicate value, null key, null value

/*
output is in sorted order (on the basis of key)
duplicate keys: vales are overwritten, most recent value is stored
no key: compile time error
null key: run time error
value can be kept null
*/