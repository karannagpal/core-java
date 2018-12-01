/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0311.compare;

/**
 *
 * @author HP
 */
import java.util.*;
public class AgeComparator implements Comparator {
    public int compare(Object o1, Object o2)
    {
        csStudent s1 = (csStudent)o1;
        csStudent s2 = (csStudent)o2;
        
        if(s1.age == s2.age)
        {
            return 0;
        }
        else if(s1.age > s2.age)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
    
}
