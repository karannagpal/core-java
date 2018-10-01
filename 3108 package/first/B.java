/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

/**
 *
 * @author HP
 */
public class B extends A
{
    void setData()
    {
        x = 10;
        y = 20;
        z = 100;
        r = 10;
    }
    
    public static void main(String args[])
    {
        B obj = new B();
        obj.setData();
        
    }
    
}
