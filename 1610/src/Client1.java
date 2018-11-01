/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


/**
 *
 * @author HP
 */
public class Client1 {
    double radius, result;
    
    public Client1()
    {
        try
        {
            //creating a socket
            Socket c = new Socket("127.0.0.1", 1312);
            
            Scanner s1 = new Scanner(System.in);
            
            System.out.println("Enter radius");
            radius = s1.nextDouble();
            
            
            DataInputStream f = new DataInputStream(c.getInputStream());
            DataOutputStream to = new DataOutputStream(c.getOutputStream());
            to.writeDouble(radius);
            
            
            result = f.readDouble();
            System.out.println("Radius: = " + radius + " and Area: " + result);
            
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
        new Client1();
    }
}
