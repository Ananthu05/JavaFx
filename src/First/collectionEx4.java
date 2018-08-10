package First;

import java.util.HashMap;
import java.util.Map;

public class collectionEx4 {
    String name;
    int rno;
    String dept;

    public collectionEx4(String name, int rno, String dept) {
        this.name = name;
        this.rno = rno;
        this.dept = dept;
    }

    public static void main(String[] args)
    {
        collectionEx4 c=new collectionEx4("rahul",11,"EEE");
        collectionEx4 c1=new collectionEx4("jino",12,"ECE");
        collectionEx4 c2=new collectionEx4("amal",13,"EEE");
        HashMap<Integer,collectionEx4> m=new HashMap();
        m.put(1,c);
        m.put(2,c1);
        m.put(3,c2);
        for(Map.Entry<Integer,collectionEx4> obj:m.entrySet())
        {
            System.out.println("key is:"+obj.getKey());
           // collectionEx4 c3=obj.getValue();
           // System.out.println("Name is:"+c3.name+" "+"roll number is:"+c3.rno+" "+"department is:"+c3.dept);
            System.out.println("Name is:"+obj.getValue().name+" "+"roll number is:"+obj.getValue().rno+" "+"department is:"+obj.getValue().dept);
        }
    }
}
