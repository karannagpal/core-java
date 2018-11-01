
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */
//online chat

public class Server3 {
    String msg;
    
    Server3()
    {
        try
        {
            Socket s2 = null;
            ServerSocket s1 = new ServerSocket(4102);
            System.out.println("Server started");
            
            DataInputStream d = null;
            DataOutputStream o = null;
            s2 = s1.accept();
            System.out.println("value accepted, port number: " + s2.getLocalPort());
            
            d = new DataInputStream(s2.getInputStream());
            
            Scanner sc1 = new Scanner(System.in);
            String r;
            
            o = new DataOutputStream(s2.getOutputStream());
            
            
            do
            {
                msg = d.readUTF();
                System.out.println("Client says: " + msg);
                System.out.println("Server: ");
                
                r = sc1.nextLine();
                o.writeUTF(r);
            }
            while(!msg.equals("stop"));
            
            d.close();
            o.close();
            s2.close();
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            //System.out.println("" + e.printStackTrace());
            
            //e.printStackTrace();
        }
    }
    
    public static void main(String[] args)
    {
        new Server3();
    }
    
    
}
