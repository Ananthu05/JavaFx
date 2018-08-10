package First;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class collectionEx1 {
    public static void main(String[] args)
    {

        HashSet<String> al=new HashSet();//generic declaration
        HashSet al1=new HashSet();//non generic declaration
        LinkedHashSet linkedHashSet=new LinkedHashSet();//linkedhashset will store the datats in order
        linkedHashSet.add("abc");
        linkedHashSet .add("def");
        linkedHashSet.add("ghi");
        linkedHashSet.add(12);
        linkedHashSet.add(55);
        linkedHashSet.add(null);//multiple null vales cannot be added
        linkedHashSet.add(null);
        for(Object o:linkedHashSet)//since we have added both string and integer type values to the hash-set(non generically),we must type o"Object" in the iteration statement
        {
            System.out.println(o);
        }
    }
}
