package Files;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

//taking content from 1 file and copying it to other file.

public class FileEx3 {
    public static void main(String[] args) throws IOException {
        FileWriter fout=new FileWriter("output.txt");  //character oriented
        fout.write("hello");
        fout.close();

        FileReader fin=new FileReader("output.txt");//read done by byte wise
        int ch=0;
        FileWriter fout1=new FileWriter("oooouuuutttpppuuttt.txt");
        while((ch=fin.read())!=-1){
            fout1.write(ch);
        }
        fout1.close();
        fin.close();
    }
}
