import java.util.Scanner;

public class CWH_ch_05_pr_07 {
    public static void main(String[] args) {
        System.out.println("Please enter the no of rows: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int i = 1;
        int j = 1;
        while (i <= rows) {
            j = i;
            while (j <= rows) {
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.print("\n");
        }
        sc.close();
    }
}
