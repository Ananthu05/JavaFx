package Polymorphism;
import java.util.LinkedList;

public class Employee {
         String empname;
         float salary;
         String dept;

    public Employee(String empname, float salary, String dept) {
        this.empname = empname;
        this.salary = salary;
        this.dept = dept;
    }
    static void addemployee(LinkedList<Employee> e4)
    {
        for(Employee obj:e4)
        {
            System.out.println(obj.empname+" "+obj.salary+" "+obj.dept);
        }
    }
    public static void main(String[] args)
    {
        LinkedList<Employee> e1=new LinkedList();

        Employee e2=new Employee("ananthu",50000,"EEE");
        Employee e3=new Employee("rahul",5000,"EEE");

        e1.add(e2);
        e1.add(e3);
        addemployee(e1);


    }
}
