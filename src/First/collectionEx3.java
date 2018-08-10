package First;
import java.util.*;
import java.util.HashMap;

public class collectionEx3 {
    public static void main(String[] args)
    {
        //key-value pair or entry
        //hashtable implementation of map interface
        HashMap<String,Integer> m=new HashMap();
        m.put("ananthu",949631377);
        m.put("UNNI",98975688);
        m.put("ananthu",949631377);
        m.put("UNNI",98975688);//multiple entries are not possible
        m.put(null,94963377);
        //it will be dsiplayed ina random manner
//m.remove("UNNI");//removes the entire ENTRY
        //for iterating,we need to convert the map inteface to set interface
        for(Map.Entry<String,Integer> obj:m.entrySet())//returns the entry set
        {
            System.out.println("key is:"+obj.getKey());
            System.out.println("value is:"+obj.getValue());
        }
    }
    }

