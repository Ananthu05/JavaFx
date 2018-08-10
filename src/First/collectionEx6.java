package First;

import java.util.TreeMap;
import java.util.Map;

public class collectionEx6 {
    public static void main(String[] args)
    {
        TreeMap<String,Integer> lmap=new TreeMap();
        lmap.put("def",1);
        lmap.put("abc",2);
       // lmap.put(null,null);
        lmap.put("ghi",3);
        lmap.put("jkl",4);
        for (Map.Entry<String,Integer> obj:lmap.entrySet()) //it displays in the ascending order of the entered key
        {
            System.out.println("key is:"+obj.getKey()+" "+"value is:"+obj.getValue());
        }
    }
}
