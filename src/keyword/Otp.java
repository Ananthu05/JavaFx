package keyword;
import java.util.Random;

public class Otp {
    public static void main(String[] args)
    {
        String s1="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String s2="abcdefghijklmnopqrstuvwxyz";
        String s3="0123456789";
        String s=s1+s2+s3;
        int len=8;
        Random r=new Random();
        char password[]=new char[len];
        for(int i=0;i<len;i++)
        {
            password[i]=s.charAt(r.nextInt(s.length()));
            System.out.print(password[i]);
        }

    }
}
