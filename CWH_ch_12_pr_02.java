import java.util.Scanner;
public class CWH_ch_12_pr_02 {
    static String name;
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        System.out.println("Hello "+name);
        sc.close();
    }
}
