/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placementcell;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
    Connection db;
    public MyConnection()
    {
        try
        {
            db=DriverManager.getConnection("jdbc:mysql://localhost/dbplacementcell", "root","");
        }
        catch(Exception e)
        {
            System.out.println("Error from MyConnection class: " + e.getMessage());
        }
    }
}