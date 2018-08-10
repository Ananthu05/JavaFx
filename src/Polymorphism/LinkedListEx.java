package Polymorphism;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkedListEx {
    public static void main(String[] args)
    {
        //generic declaration
        List<String> al=new LinkedList();
        LinkedList<String> al1=new LinkedList();
        al1.add("ananthu");
        al1.add("njan thanne");
        al1.add(null);
        al1.add(null);
        al1.addFirst("Psy EEE");//ADDS ELEMENT TO THE FIRST INDEX:it is not possible in arrylist
        al1.removeFirst();
        al1.removeLast();

        al1.removeFirst();
        al1.removeLast();
        for(String x:al1)
        {
            System.out.println(x);
        }
        Iterator itr=al1.iterator();
        while(itr.hasNext())//hasnext() is used for comparison and returns boolean,while next() returns the next object.
        {
            System.out.println(itr.next());
        }
        LinkedList<Integer> al2=new LinkedList();
        al2.add(2);


    }
}
