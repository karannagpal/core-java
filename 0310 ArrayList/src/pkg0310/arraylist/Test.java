package pkg0310.arraylist;

import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author HP
 */
public class Test {
    public static void main(String args[])
    {
        ArrayList<csStudent> ldata = new ArrayList<>();

        try
        {
            MyConnection obj = new MyConnection();
            String q = "select * from tbstudent";
            PreparedStatement pst = obj.db.prepareStatement(q);
            
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                csStudent obj1 = new csStudent();
                obj1.setRno(rs.getInt("id"));
                obj1.setName(rs.getString("fname"));
                obj1.setMarks(rs.getInt("marks"));
                ldata.add(obj1);
            }
            
            for(int i = 0; i < ldata.size(); i++)
            {
                System.out.print("rno is: " + ldata.get(i).getRno());
                System.out.print("  name is: " + ldata.get(i).getName());
                System.out.println("  marks are: " + ldata.get(i).getMarks());
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
    
