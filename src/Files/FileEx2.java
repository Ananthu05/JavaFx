package Files;
import java.io.File;
import java.io.IOException;



public class FileEx2 {
    public static void main(String[] args) throws IOException {
        File f=new File("in.text");
        if(!(f.exists()))
            f.createNewFile();



    }

}
