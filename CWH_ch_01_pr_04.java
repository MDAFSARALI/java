// Write a java program to convert kilometer into miles?
import java.util.Scanner;
public class CWH_ch_01_pr_04 {
    public static void main(String[] args) {
        System.out.println("Please enter the distance in kilometer: ");
        Scanner sc = new Scanner(System.in);
        double a=sc.nextInt();
        double miles=a*0.621;
        System.out.println("Entered number in miles is : "+miles);
        sc.close();
    }
}
