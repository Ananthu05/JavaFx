package Thread;

public class ThreadEx3 implements Runnable {

    public void run()
    {
        for(int i=0;i<5;i++)
            System.out.println(i);
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        ThreadEx3 obj=new ThreadEx3();
        Thread t=new Thread(obj);
        t.start();
        try {
            t.join();//next thread will be invoked after the execution of the first thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread t1=new Thread(obj);
        t1.start();
        System.out.println("in main"+t.getName());
        System.out.println("in main"+t1.getName());
        System.out.println("*****");
    }
}
