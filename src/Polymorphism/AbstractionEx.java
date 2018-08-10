package Polymorphism;
//provides 0-100% abstraction
public class AbstractionEx extends Abstracton {
    @Override
    int add(int x, int y) {
        return x + y;
    }

    @Override
    void display() {
        System.out.println("abstract class function");
    }

    public static void main(String[] args) {
        AbstractionEx ex = new AbstractionEx();
        ex.add(5, 4);
        ex.display();
        Abstracton s = new AbstractionEx();
      //  Abstracton o = new AbstractionEx();
       // Abstracton x = ex;
        s.show();
    }
}