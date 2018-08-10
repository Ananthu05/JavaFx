package First;

import java.util.LinkedHashMap;
import java.util.Map;

public class collectionEx5 {
    public static void main(String[] args)
    {
LinkedHashMap<String,Integer> lmap=new LinkedHashMap();
        lmap.put("abc",1);
        lmap.put("def",2);
        lmap.put("ghi",3);
        lmap.put("jkl",4);
        for (Map.Entry<String,Integer> obj:lmap.entrySet()) //it maintains the insertion order
        {
            System.out.println("key is:"+obj.getKey()+" "+"value is:"+obj.getValue());
        }
}
}
