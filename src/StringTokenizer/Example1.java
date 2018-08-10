package StringTokenizer;

import java.util.StringTokenizer;

public class Example1 {
    public static void main(String[] args) {
        StringTokenizer tokenizer = new StringTokenizer("hi hello,how,r,u", "e" );
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}