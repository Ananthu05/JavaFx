package Thread;

public class threadEx4 extends Thread {
    threadEx5 obj;

    public threadEx4(threadEx5 obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        obj.display();
    }

}
    class threadEx6 extends Thread {
        threadEx5 obj;

        public threadEx6(threadEx5 obj) {
            this.obj = obj;
        }

        threadEx5 obj1;

        @Override
        public void run() {
            obj.display();
        }



        public static void main(String[] args) {
            threadEx5 ex = new threadEx5(5);
            threadEx5 ex1 = new threadEx5(500);
            threadEx4 obj = new threadEx4(ex);
            threadEx4 obj1 = new threadEx4(ex);
            threadEx4 obj2 = new threadEx4(ex);
            obj.start();
            obj1.start();
            obj2.start();
        }
    }
