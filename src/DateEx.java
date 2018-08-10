import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        Date today;
        SimpleDateFormat sdf;
        today=new Date();
        sdf=new SimpleDateFormat("dd/MM/yy");
        System.out.println(sdf.format(today));
    }
}
