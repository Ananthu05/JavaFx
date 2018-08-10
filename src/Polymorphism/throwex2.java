package Polymorphism;

import java.io.IOException;

public class throwex2 {
    public void first()
    {
        second();
    }
    public void second() {
        third();
    }
    public void third()

        {
            throw new ArithmeticException("exception");
        }

    public static void main(String[] args)
    {
        throwex2 t=new throwex2();
        try
        {
            t.first();
        }
        catch(Exception t1)
        {
    t1.printStackTrace();
            System.out.println("exception caught");
        }
    }
}
