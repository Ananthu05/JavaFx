package First;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class collectionEx {
    public static void main(String[] args)
    {

        HashSet<String> al=new HashSet();//generic declaration
        HashSet al1=new HashSet();//non generic declaration
       al1.add("abc");
        al1.add("def");// when using hashset ,datas will be stored in random locations and will not be displayed in order
        al1.add("ghi");
        al1.add(12);
        al1.add(55);
        al1.add(null);
        for(Object o:al1)//since we have added both string and integer type values to the hash-set(non generically),we must type o"Object" in the iteration statement
        {
            System.out.println(o);
        }
    }
}
