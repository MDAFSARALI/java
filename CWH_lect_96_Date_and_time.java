public class CWH_lect_96_Date_and_time {
    public static void main(String[] args) {
        // 1 jan 1970 se java me ye socha gaya ki hm log miliSec me time to calculate karenge for the upcomming times..
        // In java 1900 years is a base year\Starting year....
        System.out.println("Total no of milli secound passed since 1 jan 1970 are: "+System.currentTimeMillis()); //Time passed after 1 jan 1970 is showed by the currentTimeMillis(); method...
        System.out.println("Total no of secound passed since 1 jan 1970 are: "+System.currentTimeMillis()/1000);//--->Convertion of milli sec into Sec
        System.out.println("Total no of minute passed since 1 jan 1970 are: "+System.currentTimeMillis()/1000/60);//--->Convertion of milli sec into minute
        System.out.println("Total no of Hours passed since 1 jan 1970 are: "+System.currentTimeMillis()/1000/60/60);//--->Convertion of milli sec into Hours
        System.out.println("Total no of Day passed since 1 jan 1970 are: "+System.currentTimeMillis()/1000/60/60/24);//--->Convertion of milli sec into Days
        System.out.println("Total no of Years passed since 1 jan 1970 are: "+System.currentTimeMillis()/1000/60/60/24/365);//--->Convertion of milli sec into Years
    }
}
