import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Map
{
	public static void main(String args[])
	{
		try
		{
			MyConnection obj = new MyConnection();
			String q = "select * from tbStudent";
			PreparedStatement pst = obj.db.prepareStatement(q);

			ResultSet rs = pst.executeQuery();

			TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

			while(rs.next())
			{
				tm.put(rs.getInt("rno"), rs.getString("name"));
			}

			for(Map.Entry m : tm.entrySet())
			{
				System.out.println("key: " + m.getKey() + ", value: " + m.getValue());
			}
		}
	}

}