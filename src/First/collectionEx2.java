package First;

import java.util.TreeSet;
import java.util.LinkedHashSet;

public class collectionEx2 {
    public static void main(String[] args)
    {


        TreeSet<String> t1=new TreeSet();
        TreeSet t=new TreeSet();//datats will be sorted in ascending order
        t.add("abc");
        t.add("ghi");
        t.add("def");
        // linkedHashSet.add(12);
        //linkedHashSet.add(55);
        //t.add(null);
        t.add("12");
        t.add("23");

        for(Object o:t)
        {
            System.out.println(o);
        }
    }
}
