import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class CWH_ch_15_pr_02 {
    public static void main(String[] args) {
        LocalTime lt=LocalTime.now();
        // System.out.println(lt);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("h:m:s");
        
        String mydtf=lt.format(dtf);
        System.out.println(mydtf);
    }
}
