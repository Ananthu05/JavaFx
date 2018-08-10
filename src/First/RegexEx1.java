package First;
import java.util.regex.*;

public class RegexEx1 {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("hello");//string to search
        Matcher m=p.matcher("hello Motto hello");//input string
        boolean b=false;
        while(m.find()) //check whether it is present(boolean output)
        {
            System.out.println("found" + m.group() + "at start index" + m.start() + "and ending index at"+m.end());//(m.group)-returns the matching word
                                                                                                                   //(m.start)-starting and end index
                                                                                                                   //(m.end)-
            b = true;
        }
        if(b==false)
        {
            System.out.println("not found");
        }
    }
}
