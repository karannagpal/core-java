import java.io.DataInputStream;
import java.io.DataOutputStream;
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

public class Client3 {
    String result;
    
    public Client3()
    {
        try
        {
            Socket c = new Socket("127.0.0.1", 4102);
            Scanner sc2 = new Scanner(System.in);
            
            int s = 0;
            DataInputStream f;
            DataOutputStream to;
            String msg;
            System.out.println("Enter Message: ");
            
            do
            {
                System.out.println("Client: ");
                msg = sc2.nextLine();
                f = new DataInputStream(c.getInputStream());
                to = new DataOutputStream(c.getOutputStream());
                
                to.writeUTF(msg);
                
                result = f.readUTF();
                System.out.println("Server replied: " + result);
            }
            while(!result.equals("stop"));
            
            f.close();
            to.close();
            c.close();    
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args)
    {
        new Client3();
    }
}
