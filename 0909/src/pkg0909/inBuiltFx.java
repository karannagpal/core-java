package pkg0909;

public class inBuiltFx
{
    public static void main(String args[])
    {
        StringBuffer obj = new StringBuffer();
        System.out.println("length: " + obj.length());
        System.out.println("capacity: " + obj.capacity());    //deafult is 16
        StringBuffer sbf = new StringBuffer("Java");
        System.out.println("Length: " + sbf.length());
        System.out.println("capacity: " + sbf.capacity());    //default is 16
        System.out.println();
        
        System.out.println(sbf.append(" is good"));
        System.out.println(sbf.insert(0, "learning "));
        System.out.println(sbf.deleteCharAt(10));
        System.out.println();
        
        sbf.delete(12, 20);
        System.out.println(sbf);
        sbf.replace(3, 5, "*something here*");
        System.out.println(sbf);
        System.out.println();
        
    }
}
