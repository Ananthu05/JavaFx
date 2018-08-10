package Files;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

public class sample {
    public static void main(String[] args) throws IOException
    {
     File f=new File("firstpro","input.txt")  ;
        f.mkdirs();//to create a new directory

       // System.out.println(f.exists());//returns boolean
        File f1=new File("sample","file1.txt")  ;
        f1.getParentFile().mkdirs();//first file will be directory and next will be file
        f1.createNewFile();
        System.out.println(f1.getPath());//specify the path
        System.out.println(f1.getAbsolutePath());//specify whole path
        File f4=new File("sample.txt");
        f4.createNewFile();
        FileOutputStream f5=new FileOutputStream(f4);
        f5.write(3);
        f5.close();
        FileInputStream f6=new FileInputStream(f4);
        System.out.println(f6.read());
    }
}
