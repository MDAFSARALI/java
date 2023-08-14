// import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
public class CWH_lect_99_GeorgerianCalender {
    public static void main(String[] args) {
        // Calendar c=Calendar.getInstance();
    //    System.out.println(c.getTime());
    //    System.out.println(c.get(Calendar.DATE));
    //    System.out.println(c.get(Calendar.SECOND));
    //    System.out.println(c.get(Calendar.MONTH));
    //    System.out.println(c.get(Calendar.YEAR));
    //    System.out.println(c.get(Calendar.HOUR));
    //    System.out.println(c.get(Calendar.HOUR_OF_DAY));//Railway wala timing...
    //    System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+(c.get(Calendar.MINUTE)+":"+(c.get(Calendar.SECOND))));//Fully railway timing formate 

    //    System.out.println(Calendar.DATE);
    //    System.out.println(Calendar.SECOND);
    // GeorgerianCalender is a concrete class in java and it is a sub class of calendar class...
    GregorianCalendar cal=new GregorianCalendar();
        System.out.println(cal.isLeapYear(2019));
        // System.out.println(c.getTime());

        // System.out.println(TimeZone.getTimeZone("ASIA/calcutta"));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getDefault());
        System.out.println(TimeZone.getAvailableIDs());

        
}
}
