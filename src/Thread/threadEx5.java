package Thread;

public class threadEx5 {
    static int x;
    public threadEx5(int x)
    {
        this.x=x;
    }

 static synchronized public void display() //when we use synchronized,only one thread will be executed at a time.
  {
        for (int i=0;i<5;i++)
        System.out.println(i*x);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
