import java.time.LocalTime;
import java.util.Calendar;

public class CWH_ch_15_pr_03 {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        LocalTime lt=LocalTime.now();
        //System.out.println(Calendar.getInstance());
        // System.out.println(c.getTime());
        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
    }
}
