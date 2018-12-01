package payroll;

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
            db=DriverManager.getConnection("jdbc:mysql://localhost/dbpayroll", "root","");
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args)
    {
        myConnection obj=new myConnection();
    }
}
