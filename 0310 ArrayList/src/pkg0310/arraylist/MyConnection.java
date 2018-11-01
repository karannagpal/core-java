package pkg0310.arraylist;

/**
 *
 * @author HP
 */
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author HP
 */
public class MyConnection {
    Connection db;
    public MyConnection()
    {
        try
        {
            db=DriverManager.getConnection("jdbc:mysql://localhost/dbtest", "root", "");
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args)
    {
        MyConnection obj=new MyConnection();
    }
}

