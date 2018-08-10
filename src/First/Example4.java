package First;

public class Example4 {
    public static void main(String[] args)
    {
        String s1="abc";
        String s2="def";
        String s="HI HELLO";
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));
        System.out.println(s.substring(0,3));
        char ch[]={'h','e','l','l','o'};
        String s3=new String(ch);
        String s4="  hello world  ";
        System.out.println(s4.trim());
        System.out.println(s4.toUpperCase());
        System.out.println(s4.toLowerCase());

    }
}
