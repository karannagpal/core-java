package pkg0709.strings;

public class PallindromeCount {
    public static void main(String[] args) {
        String s = "Nitin and Naman are brothers";
        String ls = s.toLowerCase();
        
        String words[] = ls.split(" ");
        int totalWords = words.length;
        int count = 0;
        
        for(int i = 0; i < totalWords; i++)
        {
            int l = words[i].length();
            String rev = "";
            
            //finding reverse of i'th word
            for(int j = l-1; j >= 0; j--)
            {
                rev = rev + words[i].charAt(j);
            }
            
            if(words[i].equals(rev))
            {
                count++;
            }
        }
        
        System.out.println("pallindromes: " + count);
    }
}
