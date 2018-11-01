package pkg0310.arraylist;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class TestJoin {
    public static void main(String[] args)
    {
        ArrayList<Product> data = new ArrayList<>();
        try
        {
            //table names are aliased as c and p respectively
            
            MyConnection obj = new MyConnection();
            String q = "select p.id, p.pname, p.quantity, p.price, c.cname from tbcategory c, tbproduct p where p.cid=c.id";
            PreparedStatement pst = obj.db.prepareStatement(q);
            
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                Product obj1 = new Product();
                obj1.setId(rs.getInt("id"));
                obj1.setPname(rs.getString("pname"));
                obj1.setPrice(rs.getInt("price"));
                obj1.setQuantity(rs.getInt("quantity"));
                obj1.setCname(rs.getString("cname"));
                data.add(obj1);
            }
            
            for(int i = 0; i < data.size(); i++)
            {
                System.out.println("id: " + data.get(i).getId());
                System.out.println("prod name" + data.get(i).getPname());
                System.out.println("qty " + data.get(i).getQuantity());
                System.out.println("price " + data.get(i).getPrice());
                System.out.println("cat name " + data.get(i).getCname());
            }
            
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
