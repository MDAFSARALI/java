// import java.sql.Date;
// import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class CWH_lect_101_DateTimeFormate {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-YYYY--E a H:m");//dte and formate do ko is tarah milaya ki ak new formate ban gaya
        // E word se hm log day maloom kar sakte hai
        // and a is being used for am and pm... 
        // H for hours and m for minute....
        String mydt=dt.format(dtf);
        System.out.println(dtf);
        System.out.println(mydt);
        DateTimeFormatter dtfiso=DateTimeFormatter.ISO_DATE_TIME;
        String d1t1=dt.format(dtfiso);
        System.out.println(d1t1);
        // DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd-MM-YYYY :h-m-s");
        // String mdtf1=dt.format(dtf1);
        // System.out.println(mdtf1);




    }
}
