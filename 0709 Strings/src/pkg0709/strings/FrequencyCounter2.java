package pkg0709.strings;

public class FrequencyCounter2 
{
    public static void main(String args[])
    {
        String s = "we are learning java we are javas";
        int l = s.length();
        String sub = "learning";

        String arr[] = s.split(" ");
        int arl = arr.length;

        char ch[] = s.toCharArray();
        int count = 0;

        for(int i = 0; i < arl; i++)
        {
            if(sub.equals(arr[i]))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
