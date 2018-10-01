/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0709.strings;


public class inBuiltFx {
    public static void main(String args[])
    {
        String s = "We are learning java";
        
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(4));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println();
        
        System.out.println(s.substring(3));
        System.out.println(s.substring(3, 5));
        System.out.println(s.startsWith("we"));
        System.out.println(s.startsWith("We"));
        System.out.println(s.endsWith("we"));
        System.out.println();
        
        System.out.println(s.indexOf("are"));
        System.out.println(s.indexOf("The"));
        System.out.println(s.indexOf("are", 5));
        System.out.println();
        
        String x = "JAVA";
        String y = "java";
        System.out.println(x.equals(y));
        System.out.println(x.equalsIgnoreCase(y));
        System.out.printf("this is a %s in java, number %d\n", "preformatted text", 10);
        
        
    }
}
