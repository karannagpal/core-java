package pkg0709.strings;

public class Reverse {
    
    public static void main(String args[])
    {
        String s = "We are learning java";
        int l = s.length();
        char ch;
        
        for(int i = l-1; i >= 0; i--)
        {
            ch = s.charAt(i);
            System.out.print(ch);
        }
        System.out.println();
    }
    
}
