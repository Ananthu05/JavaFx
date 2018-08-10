package First;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class collections {
    public static void main(String[] args)
    {
        List<String> al=new ArrayList<String>();//we can define array list in 3 different ways
        ArrayList<String> al2=new ArrayList<String>();//2
        List<String> al1=new ArrayList<String>();//3
        al.add("abc");
        al.add("efg");
        al.add("xyz");
        for (String obj:al)//we can iterate using for-each,while and using iterator
        {
            System.out.println(obj+" ");
        }
        System.out.println("\n");
        System.out.println("using iterator");
        Iterator itr=al.iterator();
        while(itr.hasNext())//returns true or false
        {
            System.out.println(itr.next()+" ");//returns the objects
        }
        System.out.println("\n");
        System.out.println("using for loop");
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i)+" ");
        }
        ArrayList<String> al22=new ArrayList<>();
        al22.add("jino");
        al22.add("rahul");
        al.addAll(al22);//merges one arraylist to the other or to add one collection to another collection
        Iterator itr1=al.iterator();
        {
            while(itr1.hasNext())
            {
                System.out.println(itr1.next()+" ");
            }
        }
    }
}

