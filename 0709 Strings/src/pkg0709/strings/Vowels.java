/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0709.strings;

public class Vowels {
    public static void main(String args[])
    {   
        String s = "qwertyuiop asdfghjkl zxcvbnm";
        int count = 0;
        int l = s.length();
        String lower = s.toLowerCase();
        
        for(int i = 0; i < l; i++)
        {
            char ch = lower.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count++;
        }
        
        System.out.println("total vowels: " + count);
    }
}
