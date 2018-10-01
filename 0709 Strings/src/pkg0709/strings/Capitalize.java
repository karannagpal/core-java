package pkg0709.strings;

public class Capitalize {
    public static void main(String args[])
    {
        String s = "we are learning java";
        int l = s.length();
        
        char ch[] = s.toCharArray();
        
        //capitalizing first char of string
        ch[0] = (char)(ch[0] - 32);
        
        for(int i = 0; i < l; i++)
        {
            if(ch[i] == 32)
            {
                ch[i+1] = (char)(ch[i+1] - 32);
                System.out.print(ch[i]);
            }
            else
            {
                System.out.print(ch[i]);
            }
            
        }
        
    }
    
}
