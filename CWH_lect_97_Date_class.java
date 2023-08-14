import java.util.Date;

public class CWH_lect_97_Date_class {
    public static void main(String []args){
         // System.out.println(Long.MAX_VALUE);
        // System.out.println(System.currentTimeMillis());
        // Yes ! It is safe to store the milli secound in long because me can store 10 lakh times long or large value than current time value...
        Date d=new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        // Some Deprecated methods: 
        //  System.out.println(d.getDate());
        // System.out.println(d.getSeconds());
        // System.out.println(d.getMinutes());
        // System.out.println(d.getYear()+1900);
        
    }

}
