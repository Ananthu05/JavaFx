package First;
 import java.util.ArrayList;
public class student1 {
    int rollno;
    String name;
    int age;
    public student1(int rollno,String name,int age)
    {
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
    public static void main(String[] args)
    {
        ArrayList<student1> a1=new ArrayList();
        student1 s1=new student1(11, "jino",23);
        student1 s2=new student1(12, "rahul",24);
        student1 s3=new student1(13, "ananth",25);
        a1.add(s1);
        a1.add(s2);
        a1.add(s3);
        for(student1 s:a1)
        {
            System.out.println("roll no is"+s.rollno+"name is"+s.name+"age is"+s.age);
        }
    }
    }


