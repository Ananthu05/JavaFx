package Thread;

public class threadEx2 implements Runnable{
    public void run()
    {
        System.out.println("Thread in execution");
    }

    public static void main(String[] args) {
        threadEx2 obj=new threadEx2();
        Thread t=new Thread(obj);
        t.start();
        System.out.println("*****");
    }

}
