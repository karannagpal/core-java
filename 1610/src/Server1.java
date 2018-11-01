
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */
public class Server1 {
    double area;
    Server1()
    {
        try
        {
            //creating a server socket
            ServerSocket s1 = new ServerSocket(1312);
            System.out.println("Server started.");
            
            Socket s2 = s1.accept();
            System.out.println("value accepted, port number of socket: " + s2.getLocalPort());
            DataInputStream d = new DataInputStream(s2.getInputStream());
            DataOutputStream o = new DataOutputStream(s2.getOutputStream());
            
            double radius = d.readDouble();
            area = 3.14 * radius * radius;
            
            //writing the value back on outputstream of socket and sending it back
            o.writeDouble(area);
            
            
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
        new Server1();
    }
}
