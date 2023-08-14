import java.util.Scanner;

public class CWH_ch_07_pr_04 {
    static void reverse_star_pattern(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter the no of rows: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("Your enterd reverse pattern is :");
        reverse_star_pattern(rows);
        sc.close();

    }
}
