package pkg0210.multithreading;

/**
 *
 * @author HP
 */
public class Test {
    public static void main(String args[])
    {
        A obj1 = new A();
        obj1.start();
        try {
            obj1.isAlive();
            obj1.join();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        obj1.isAlive();
        System.out.println(obj1.result);
    }
}
