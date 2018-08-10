package Polymorphism;

public class sample1 {
    public static void main(String[] args)
    {
        Firstinterface f=new Firstinterface() //anonymous inner class:
        {

            @Override
            public int add(int x, int y) {
                return 0;
            }

            @Override
            public void display() {
                System.out.println("hello");

            }

        };
f.display();
f.add(5,10);
 }
}
