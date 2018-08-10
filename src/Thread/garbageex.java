package Thread;

public class garbageex {
    protected void finalize() throws Throwable {
        System.out.println("garbage collection");
    }


    public static void main (String[] args){
        garbageex obj = new garbageex();
        //obj = null;//manually clearing memory after use
        //Garbage1 obj1=obj;//changing referance
        garbageex obj2=new  garbageex();
        obj=null;//nulling the referance
        obj2=null;
        System.gc();

    }

}
