package keyword;

import java.util.Random;
public class RandomEx
{
    public static void main(String[] args)
    {
        Random r=new Random();
        int i;
        for(i=0;i<6;i++) {
            System.out.println(r.nextInt(100));
        }

    }
}
