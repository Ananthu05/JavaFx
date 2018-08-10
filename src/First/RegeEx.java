package First;
import java.util.regex.*;
public class RegeEx
{
    public static void main(String[] args)
    {

     boolean b=Pattern.matches(".s","as");//compares the size.
        System.out.println(b);
        System.out.println(Pattern.matches("[a-zA-Z]","J"));
        System.out.println(Pattern.matches("[aBC]{2}","JL"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]","9"));
        System.out.println(Pattern.matches("[789]{1}[0-9]{2}","953"));
        System.out.println(Pattern.matches("[@$#]","@"));
        System.out.println(Pattern.matches("[a-z]*[A-Z]*[0-9]*[@]*[a-z]*[.]*[com]*","rahulnath1996@gmail.com"));//check the email id
        System.out.println(Pattern.matches("[0-3]{1}[/]*[0-9]{2}[/]*[0-9]{4}","99//95/1996"));
        // System.out.println("[\\d]*"{5},"1233445");
    }
}
