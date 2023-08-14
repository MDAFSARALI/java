// Write a java programe to detect whether a number enterd by use is integer or not ?
import java.util.Scanner;
public class CWH_ch_01_pr_05 {
    public static void main(String[] args) {
        System.out.println("Please enter the number !!");
        Scanner sc=new Scanner(System.in);
        boolean a=sc.hasNextInt();
        System.out.println(a);
        sc.close();
    }
}
