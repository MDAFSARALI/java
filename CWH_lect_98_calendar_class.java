import java.util.Calendar;
public class CWH_lect_98_calendar_class {
    public static void main(String[] args) {
        // Calender class is an abstarct class...
        Calendar c=Calendar.getInstance();// We must have to create an instance of the Calendar class...
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        // Calendar c=Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());





    }
}
