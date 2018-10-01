package pkg0709.strings;

public class Toggle {
    public static void main(String args[])
    {
        String s = "Hello World";
        int l = s.length();
        
        char ch[] = s.toCharArray();
        
        for(int i = 0; i < l; i++)
        {
            if(ch[i] >= 65 && ch[i] <= 90)
            {
                ch[i] = (char)(ch[i] + 32);
                System.out.print(ch[i]);
            }
            
            else if(ch[i] >= 97 && ch[i] <= 122)
            {
                ch[i] = (char)(ch[i] - 32);
                System.out.print(ch[i]);
            }
            
            else
            {
                System.out.print(ch[i]);
            }
            
        }
    }
}
