import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CWH_lect_100_java_time_API {
    public static void main(String[] args) {
        LocalDate d=LocalDate.now();
        System.out.println(d);// Local date is printed
        LocalTime t=LocalTime.now();
        System.out.println(t);
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);


    }
}
