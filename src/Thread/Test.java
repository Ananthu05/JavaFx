package Thread;

 class Customer {
    int amount=10000;
    synchronized void withdraw(int amount)
    {
        System.out.println("going to withdraw");
        if(this.amount<amount)
        {
            System.out.println("less bal; waiting for deposit");
            try {
                wait();   //A lock is released and operation is stopped temporarily....until a notify() is given
            }
            catch(Exception e){}
            }
        //System.out.println(Thread.currentThread().getName());// prints the current executing thread
            this.amount-=amount;
        System.out.println("withdraw completed");
        }
        synchronized void deposit(int amount)
        {
            System.out.println("going to deposit");
            this.amount+=amount;
            System.out.println("deposit completed");
            notify();
            //notifyAll(); //it wakes all the waiting threads.
    }
}
class Thread1 extends Thread{
    Customer c;
    Thread1(Customer c)
    {
        this.c=c;
    }
    public void run()
    {
        c.withdraw(15000);
    }
}
class Thread2 extends Thread
{
    Customer c;
    Thread2(Customer c)
    {
        this.c=c;
    }
    public void run()
    {
        c.deposit(10000);
    }
}
public class Test    //file name and main class name is same
{
    public static void main(String[] args) {
        Customer obj=new Customer();
        Thread1 t1=new Thread1(obj);
        Thread2 t2=new Thread2(obj);
       // Thread1 t3=new Thread1(obj);
        //Thread2 t4=new Thread2(obj);
        t1.start();   //executes withdraw....
        t2.start();
        // t3.start();
        //t4.start();
    }
}