import java.util.Scanner;

public class CWH_ch_02_pr_03 {
    public static void main(String[] args) {
        System.out.println("Please Enter the number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // boolean c=a>100;
        // System.out.println(c);----------This is the basic method_______
        System.out.println(a > 100);
        sc.close();
    }
}
