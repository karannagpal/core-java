package second;

import first.A;

public class D extends A {
    void setData()
    {
        x = 100;
        y = 10;
        z = 23;
        r = 10;
    }
    
    public static void main(String args[])
    {
        D obj = new D();
        obj.setData();
    }
}
