package Polymorphism;

public class interfaceex implements Firstinterface {
    @Override
    public void display()
    {
        System.out.println("interface example");
    }
    @Override
    public int add(int x,int y){
        return x+y;
    }

}
