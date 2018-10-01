package pkg0709.strings;

public class Pattern {
    public static void main(String args[])
    {
        String s = "JAVA";
        int l = s.length();
        
        for(int i = 0; i < l; i++)
        {
            for(int j = 0; j < l-i; j++)
            {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}
