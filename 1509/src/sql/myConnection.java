package sql;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author HP
 */
public class myConnection {
    Connection db;
    public myConnection()
    {
        try
        {
            db=DriverManager.getConnection("jdbc:mysql://localhost/dbtest", "root","");
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
