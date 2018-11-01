package pkg0210.multithreading;

/**
 *
 * @author HP
 */
public class Table {
    synchronized void printTable(int n) {
        for(int i = 0; i <= 5; i++) {
            
            System.out.println(n + " x " + i + " = " + n*i);
            
            try {
                Thread.sleep(400);
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
