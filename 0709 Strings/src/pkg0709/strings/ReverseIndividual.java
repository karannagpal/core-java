package pkg0709.strings;

public class ReverseIndividual {
    public static void main(String[] args) {
        String s = "We are learning programming";
        
        String words[] = s.split(" ");
        int totalWords = words.length;
        
        for(int i = 0; i < totalWords; i++)
        {
            int l = words[i].length();
            for(int j = l-1; j >= 0; j--)
            {
                System.out.print(words[i].charAt(j));
            }
            System.out.print(" ");
        }
        
        System.out.println();
    }
}
