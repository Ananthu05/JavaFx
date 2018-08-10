package Thread;

public class threadEx extends Thread
{
    public void run()
    {
        System.out.println("Thread in execution");
    }

    public static void main(String[] args) {
        threadEx t=new threadEx();
        t.start();
        System.out.println("*****");
    }

}
