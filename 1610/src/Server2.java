
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.PreparedStatement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */
public class Server2 {
    String fname, lname;
    int marks;
    
    Server2()
    {
        try
        {
            ServerSocket s1 = new ServerSocket(4002);
            System.out.println("Server started.");
            
            Socket s2 = s1.accept();
            System.out.println("value accepted, port number of socket: " + s2.getLocalPort());
            DataInputStream d = new DataInputStream(s2.getInputStream());
            DataOutputStream o = new DataOutputStream(s2.getOutputStream());
            
            String fname = d.readUTF();
            String lname = d.readUTF();
            int marks = d.readInt();
            
            //code black for inserting the record
                MyConnection obj = new MyConnection();
                String q = "insert into tbstudent (fname, lname, marks) values (?, ?, ?)";
                PreparedStatement pst = obj.db.prepareStatement(q);

                pst.setString(1, fname);
                pst.setString(2, lname);
                pst.setInt(3, marks);
                pst.executeUpdate();
            //end of sql code
                
            System.out.println("record inserted in table");
            
            d.close();
            o.close();
            s2.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] a)
    {
        new Server2();
    }
    
}
