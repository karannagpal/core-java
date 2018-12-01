/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0311.compare;

/*
 *
 * @author HP
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test {
    public static void main(String args[])
    {
        ArrayList a1 = new ArrayList();
        
        a1.add(new csStudent(101, "Vijay", 23));
        a1.add(new csStudent(106, "Ajay", 25));
        a1.add(new csStudent(105, "Gogo", 21));
        
        System.out.println("Sorting by name:");
        
        Collections.sort(a1, new NameComparator());
        
        Iterator itr = a1.iterator();
        while(itr.hasNext())
        {
            csStudent st = (csStudent)itr.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
        
        System.out.println("Sorting by age:");
        
        Collections.sort(a1, new AgeComparator());
        
        Iterator itr2 = a1.iterator();
        while(itr2.hasNext())
        {
            csStudent st = (csStudent)itr2.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}
