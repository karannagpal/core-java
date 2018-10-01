package pkg0709.strings;

public class Inititals {
    public static void main(String args[])
    {
        String name = "asd qe ry yiu mnb";
        int l = name.length();
        
        String arr[] = name.split(" ");
        int arl = arr.length;
        
        for(int i = 0; i < arl; i++)
        {
            if(i == arl-1)
            {
                //printing last name fully
                System.out.print(arr[i]);
                break;
            }
            
            System.out.print(arr[i].charAt(0) + ". ");
        }
        System.out.println();
    }
}
