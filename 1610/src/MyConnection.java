/*
@author Karan
*/
import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
    Connection db;
    public MyConnection()
    {
        try
        { 
            db = DriverManager.getConnection("jdbc:mysql://localhost/dbtest", "root", "");
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

