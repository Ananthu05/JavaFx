package First;

import java.util.Map;
import java.util.TreeMap;

public class person {
    String name;
    int hno;
    String hname;

    public person(String name, int hno, String hname) {
        this.name = name;
        this.hno = hno;
        this.hname = hname;
    }
    public  static void search(Integer i,TreeMap<Integer, person> m)
    {
        for (Map.Entry<Integer,person> obj:m.entrySet())
        {
            if(obj.getKey()==i)
            {
                System.out.println("name is:"+obj.getValue().name);
            }
        }
    }
    public  static void remove(Integer i,TreeMap<Integer, person> m)
    {
        for (Map.Entry<Integer,person> obj:m.entrySet())
        {
            if(obj.getKey()==i)
            {
               m.remove(2);
                System.out.println("removed");
                break;
            }
        }

    }
    public  static void add(Integer i,TreeMap<Integer, person> m)
    {
        person p3 = new person("hukran", 4, "kootil");
        m.put(i,p3);


        for (Map.Entry<Integer,person> obj:m.entrySet())
        {
            if(obj.getKey()==4)
            {
                System.out.println("name is:"+obj.getValue().name);
            }
        }

    }
    public  static void update(Integer i,TreeMap<Integer, person> m)
    {
        person p4 = new person("chullan", 5, "thottil");
        m.put(5,p4);


        for (Map.Entry<Integer,person> obj:m.entrySet())
        {
            if(obj.getKey()==i)
            {
                System.out.println("name is:"+obj.getValue().name);
            }
        }

    }



    public static void main(String[] args) {
        TreeMap<Integer, person> t = new TreeMap();
        person p = new person("ukru", 1, "evideyoo");
        person p1 = new person("mukran", 2, "kaatil");
        person p2 = new person("chukran", 3, "naatil");

        t.put(1, p);
        t.put(2, p1);
        t.put(3, p2);
        for (Map.Entry<Integer, person> obj : t.entrySet())
        {
            System.out.println("key is:" + obj.getKey() + " " + "value is:" + obj.getValue().name + obj.getValue().hname + obj.getValue().hno);
        }
        search(1,t);
        remove(2,t);
        add(4,t);
        update(5,t);


        }
    }

