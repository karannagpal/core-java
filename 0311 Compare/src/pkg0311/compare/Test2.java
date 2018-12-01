package pkg0311.compare;

/**
 *
 * @author javaTpoint
 */
import java.util.*;
import java.io.*;
public class Test2 {
    public static void main(String args[])
    {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(101, "Vijay", 23));
        al.add(new Student(102, "Ajay", 27));
        al.add(new Student(103, "Jai", 25));
        //comparison is on the basis of age only
        Collections.sort(al);
        for(Student st:al)
        {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}
