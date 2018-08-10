package First;

public class Example7 {
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
        String s5="hi,hello,helloworld";
        System.out.println(s4.trim());
        System.out.println(s4.toUpperCase());
        System.out.println(s4.toLowerCase());
        System.out.println(s4.charAt(2)+" "+"length"+s4.length());
        String s6[]=s5.split(",");
        StringBuffer s7=new StringBuffer("hello");//thread safe(synchronized)
        System.out.println(s7.append("hellooooo"));
        String s10=s7.toString();
       System.out.println(s10);
        StringBuffer s8=new StringBuffer("hello");//thread safe(non synchronized)
        System.out.println(s8);
        char ch1[]=s2.toCharArray();
        for(String o:s6)
        {
            System.out.println(o);
        }

    }
}

