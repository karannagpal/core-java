/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */
import java.util.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TreeMapValues
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
                tm.put(rs.getInt("id"), rs.getString("fname"));
            }

            for(Map.Entry m : tm.entrySet())
            {
                System.out.println("key: " + m.getKey() + " value: " + m.getValue());
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    
    }

}
