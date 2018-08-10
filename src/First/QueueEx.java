package First;
import java.util.ArrayDeque;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        ArrayDeque<String> p=new ArrayDeque<String>();
        p.add("aju");
        p.add("anu");
        p.add("ammu");
        p.add("akku");
        p.addFirst("ananthu");
        p.addLast("unni");
        for(String x:p)
        {
            System.out.println(x);
        }

        System.out.println("first element"+p.element());//returns the 1st element....if itis empty cause erooor
        System.out.println(("first element "+p.peek()));//returns the 1st element....if empty null is printed
        System.out.println(("removed "+p.remove()));//returns and remove the first element.
        System.out.println("removed "+p.poll());//returns and remove the first element.
        System.out.println("after removal");

        for(String x:p) {
            System.out.println(x);
        }

    }
}
