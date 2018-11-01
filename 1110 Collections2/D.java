import java.util.*;

class D
{
	
	public static void main(String args[])
	{
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(103, "RAM");
		lhm.put(102, "Processor");
		lhm.put(101, "HDD");
		lhm.put(105, "CD-RW");
		lhm.put(104, "SSD");
		lhm.put(105, "Graphics Card");
		lhm.put(106, null);

		for(Map.Entry m : lhm.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}

//notes: order, duplicate key, duplicate value, null key, null value

/*
order: same as insertion order
duplicate keys are overwritten, most recent value is stored
no key: compile time error
null key: accepted, (order is still same as insertion order)
value can be kept null
*/