package pkg1409;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class EmpList {
    public static void main(String args[])
    {
        ArrayList<Emp> emplist = new ArrayList<>();
        
        Emp obj1 = new Emp();
        obj1.setId(101);
        obj1.setName("Rahul");
        obj1.setBsal(8500);
        obj1.setHra();
        obj1.setDa();
        obj1.setEpf();
        obj1.setNet();
        
        Emp obj2 = new Emp();
        obj2.setId(102);
        obj2.setName("Karan");
        obj2.setBsal(3600);
        obj2.setHra();
        obj2.setDa();
        obj2.setEpf();
        obj2.setNet();
        
        emplist.add(obj1);
        emplist.add(obj2);
        
        for(int i = 0; i < emplist.size(); i++)
        {
            System.out.println("ID: " + emplist.get(i).getId());
            System.out.println("Name: " + emplist.get(i).getName());
            System.out.println("Basic sal: " + emplist.get(i).getBsal());
            System.out.println("HRA " + emplist.get(i).getHra());
            System.out.println("DA " + emplist.get(i).getDa());
            System.out.println("EPF " + emplist.get(i).getEpf());
            System.out.println("Net salary: " + emplist.get(i).getNet());
            System.out.println();
        }
    }
}
