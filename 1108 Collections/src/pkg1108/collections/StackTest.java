/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1108.collections;

import java.util.Stack;

/**
 *
 * @author HP
 */
public class StackTest {
    //pushing element on top of stack
    static void stack_push(Stack<Integer> stack)
    {
        for(int i = 0; i < 5; i++)
        {
            stack.push(i);
        }
        System.out.println("elements pushed");
    }
    
    //popping element from top of the stack
    static void stack_pop(Stack<Integer> stack)
    {
        for(int i = 0; i < 5; i++)
        {
            Integer y = (Integer) stack.pop();
            System.out.println("item popped: " + y);
        }
        System.out.println("all elements popped");
    }
    
    //displaying elements on top of the stack
    static void stack_peek(Stack<Integer> stack)
    {
        Integer z = (Integer) stack.peek();
        System.out.println("element on top: " + z);
    }
    
    //searching element in the stack
    static void stack_search(Stack<Integer> stack, int a)
    {
        Integer pos = (Integer) stack.search(a);
        
        System.out.println("pos: " + pos);
    }
    
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<Integer>();
        
        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack, 2);
        stack_search(stack, 6);
    }
}
