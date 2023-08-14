import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CWH_ch_15_pr_04 {
    public static void main(String[] args) {
        LocalTime lt=LocalTime.now();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("h:m:s");
        String mytime=lt.format(dtf);
        System.out.println(mytime);

    }
}
