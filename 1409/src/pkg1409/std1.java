package pkg1409;

import java.util.ArrayList;

public class std1 {
    public static void main(String args[])
    {
        ArrayList<csStudent> ldata = new ArrayList<>(); //array of objects
        
        
        csStudent obj1 = new csStudent();
        obj1.setRno(101);
        obj1.setName("Rohit");
        obj1.setMarks(60);
        
        csStudent obj2 = new csStudent();
        obj2.setRno(102);
        obj2.setName("Ravi");
        obj2.setMarks(70);
        
        ldata.add(obj1);
        ldata.add(obj2);
        
        for(int i = 0; i < ldata.size(); i++)
        {
            System.out.println("roll no: " + ldata.get(i).getRno());
            System.out.println("name: " + ldata.get(i).getMarks());
            System.out.println("marks: " + ldata.get(i).getMarks());
        }
        
    }
}
