package pkg0909;

public class Pallindrome {
    public static void main(String args[]) 
    {
        StringBuffer s1 = new StringBuffer("MMOOMM");
        
        StringBuffer s2 = new StringBuffer(s1);
        String org = s1.toString();
        
        String rev = s1.reverse().toString();
        
        
        if(org.equals(rev))
        {
            System.out.println("Yes, it is a pallindrome");
        }
        else
        {
            System.out.println("No, it's not");
        }
        
    }
}
