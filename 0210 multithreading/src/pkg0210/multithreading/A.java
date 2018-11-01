package pkg0210.multithreading;

/**
 *
 * @author HP
 */
public class A extends Thread{
    double result;
    public void run() {
        try 
        {
            int i;
            for(i = 1; i<=10; i++)
            {
                result = result + getFact(i);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    int getFact(int n)
    {
        int f = 1;
        while(n > 0)
        {
            f = f*n;
            n--;
        }
        return f;
    }
}
