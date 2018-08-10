package Polymorphism;

public class Exceptionex {
    public static void main(String[] args)
    {
        try {

          String s=null;
           System.out.println(s.length());
            int z = 5 / 0;
        try {
                int y = 5 / 0;
            }
            catch (Exception e) //it will catch any exception
            {
                System.out.println("exception caught");
            }
        }
       /*catch (NullPointerException e)
        {
            System.out.println("null pointer");
        }*/
        catch(ArithmeticException e)
        {
            System.out.println("exception caught1");
        }
        finally {
            System.out.println("finally block");
        }
        System.out.println("anganonoola");
    }
}
