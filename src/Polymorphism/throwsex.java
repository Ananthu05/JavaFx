package Polymorphism;
import java.io.IOException;

public class throwsex {

        public void first() throws IOException
        {
            second();
        }
        public void second() throws IOException {
            third();
        }
        public void third() throws IOException

        {
            throw new IOException("exception");
        }

        public static void main(String[] args)
        {
            throwsex t=new throwsex();
            try
            {
                t.first();
            }
            catch(Exception t1)
            {
               // t1.printStackTrace();
                System.out.println("exception caught");
            }
        }
}
