package pkg0909;

public class Initials {
    public static void main(String args[])
    {
        StringBuffer sb1 = new StringBuffer("Mohandas Karamchand Gandhi");
        int l = sb1.length();
        
        String s1 = sb1.toString();
        String arr[] = s1.split(" ");
        int arl = arr.length;
        
        for(int i = 0; i < arl; i++)
        {
            if(i != arl-1)   //if it is not the last word
            {
                int wordStart = sb1.indexOf(arr[i]);
                int wordEnd = sb1.indexOf(arr[i]) + arr[i].length();
                String init = new String();
                init = arr[i].charAt(0) + ".";
                
                sb1.replace(wordStart, wordEnd, init);
            }
            
        }
        
        System.out.println(sb1);
    }
}
