package pkg0709.strings;
// author: ishan (from java class)
import java.util.*;

public class Initials2 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        int x=a.length();
        
        String arr[]=a.split(" ");
        int arl=arr.length;
        int count=0;
        
        if(arl==1)
        {
            char ch1[] = a.toCharArray();
            if(ch1[0]>='a' && ch1[0]<='z')
            {
                ch1[0] = (char)(ch1[0]-32);
            }
            
            for(int i=0; i<x; i++)
            {
                System.out.print(ch1[i]); 
            }
        }

        else
        {
            for(int i=0;i<arl;i++)
            { 
                char ch[]=arr[i].toCharArray();
                int k=arr[i].length();
                if((i+1)==arl)
                {
                    for(int j=0;j<k;j++)
                    {
                        if(ch[0]>='a'&&ch[0]<='z')
                        {
                            ch[0]=(char)(ch[0]-32);
                        }
                        System.out.print(ch[j]); 
                    }
                }
                
                else
                {
                    if(ch[0]>='a'&&ch[0]<='z')
                    {
                        ch[0]=(char)(ch[0]-32);
                    }
                    System.out.print(ch[0]+".");
                }
                
            }
        }
    }
}