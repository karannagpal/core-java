/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1108.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author HP
 */
public class PriorQ {
    public static void main(String args[])
    {
        //creating empty priority queue
        PriorityQueue<String> pQueue = new PriorityQueue<String>();
        pQueue.add("C");
        pQueue.add("C++");
        pQueue.add("Java");
        pQueue.add("Python");
        
        //printing the highest priority element
        System.out.println("Head value using peek function: " + pQueue.peek());
        
        
        //printing all the elements
        System.out.println("\nQueue elements are:");
        Iterator itr = pQueue.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        //poll() - removes the top priority element (or the head element)
        //and returns it as well
        System.out.println("Using .poll(): " + pQueue.poll());
        
        System.out.println("\nQueue elements after poll() function are:");
        Iterator itr2 = pQueue.iterator();
        while (itr2.hasNext())
        {
            System.out.println(itr2.next());
        }
        
        
        //using remove() to remove a perticular element
        pQueue.remove("Java");
        Iterator itr3 = pQueue.iterator();
        while (itr2.hasNext())
        {
            System.out.println(itr3.next());
        }
        
        //using contains() to check presence of element
        boolean b = pQueue.contains("C");
        System.out.println("Priority queue contains 'C' or not: " + b);
        
        //converting queue to array
        Object[] arr = pQueue.toArray();
        System.out.println("Values in array: ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println("Value: " + arr[i].toString());
        }
    }
}
