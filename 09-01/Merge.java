import java.util.Scanner;

public class Merge {
    
    int l[] = new int[5];
    int r[] = new int[5];
    int t[] = new int[10];
    
    void setData()
    {
        Scanner s1 = new Scanner(System.in);
        int i;
        System.out.println("Enter left array");
        for(i = 0; i <= 4; i++)
        {
            l[i] = s1.nextInt();
        }
        System.out.println("Enter right array");
        for(i = 0; i <= 4; i++)
        {
            r[i] = s1.nextInt();
        }
    }
    
    void merge()
    {
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i <= 4 && j <= 4)
        {
            if(l[i] < r[j])    //r[j] is smaller
            {
                t[k] = l[i];
                i++;
            }
            
            else
            {
                t[k] = r[j];
                j++;
            }
            k++;
        }
        
        if(i >= 4)
        {
            while(j <= 4)
            {
                t[k] = r[j];
                j++;
                k++;
            }
        }
        
        if(j >= 4)
        {
            while(i <= 4)
            {
                t[k] = l[i];
                i++;
                k++;
            }
        }
    }
    
    void getData()
    {
        int i;
        System.out.println("merged array:");
        for(i = 0; i <= 9; i++)
        {
            System.out.println("t[" + i + "] = " + t[i]);
        }
    }
    
    public static void main(String args[])
    {
        Merge obj = new Merge();
        obj.setData();
        obj.merge();
        obj.getData();
        
    }
}
