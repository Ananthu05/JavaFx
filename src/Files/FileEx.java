package Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("out.text");
        String S = "hello world";
        byte[] b = S.getBytes();
        fout.write(b);
        FileInputStream fin = new FileInputStream("out.text");
        // System.out.println(fin.read(b));
        int i = 0;
        while ((i = fin.read()) != -1) //checks until the end of file
        {

            System.out.println((char) i);//typecasting
        }
        fin.close();

        //fout.write(1111);
        //  FileInputStream fin=new FileInputStream("out.text");
        // System.out.println(fin.read());

    }
}