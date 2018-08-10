package Polymorphism;

public class Department {
    int deptid;
    String deptname;

    /*public void getdetails()
    {
        System.out.println("parent method");
    }*/
    public Department(int deptid,String deptname)
    {
        System.out.println("constructor is invoked");
        this.deptid=deptid;
        this.deptname=deptname;

    }
    public void dsiplay()
    {
        System.out.println("jskajsk");
    }
}