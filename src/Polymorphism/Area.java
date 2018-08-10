package Polymorphism;

public class Area {
    public void findarea(float r)
    {
        System.out.println("area="+(3.14*r));
    }
    public void findarea(float x,float y)
    {
        System.out.println("area="+(x*y));
        }
    public void findarea(int a,int b)
    {
        System.out.println("area="+(a*b));
    }
    public static void main(String[] args)
    {
        Area obj=new Area();
        obj.findarea(5);
        obj.findarea(3,5);
        obj.findarea(3.0f,5.5f);
    }
}
