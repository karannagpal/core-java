package pkg0709.strings;

public class Spaces {
    public static void main(String args[])
    {
        String s = "we are learning java";
        int count = 0;
        int l = s.length();
        
        for(int i = 0; i < l; i++)
        {
            if(s.charAt(i) == ' ')
                count++;
            
            //alternate method, ascii value of space is 32
            /*
            char ch = s.charAt(i);
            if(ch == 32)
                count++;
            */
        }
        
        System.out.println("total spaces: " + count);
        
    }
}
