package Polymorphism;
public class Faculty extends Department{
    public void display()//overriding
    {
        System.out.println("child class "+super.deptname);
        super.dsiplay();

    }
    String name;
    String number;
    int facid;
   // float salary;

    public Faculty(int dpid,String dname,int facid,String name,String number)//nonparameterized constructor
    {
        super(dpid,dname);//invokes parameterized constructor of parent class
        this.facid=facid;
        this.name=name;
        this.number=number;
        System.out.println("constructor of child class");
    }
    public static void main(String[] args)
    {
        Faculty ob=new Faculty(101,"EEE",5,"Me","9496313776");
        ob.display();
    }
}
