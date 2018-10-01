package pkg0709.strings;

public class Pallindrome {
    public static void main(String args[])
    {
        String s = "Hello";
        String low = s.toLowerCase();
        int l = s.length();
        char ch;
        String rev = "";
        
        for(int i = l-1; i >= 0; i--)
        {
            ch = low.charAt(i);
            rev = (rev + ch);
        }
        System.out.println(low);
        System.out.println(rev);
        
        
        if(low.equals(rev))
            System.out.println("Yes it is a pallindrome");
        else
            System.out.println("No, not a pallindrome");
        
    }
    
}
