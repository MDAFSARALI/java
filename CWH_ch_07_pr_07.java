import java.util.Scanner;
public class CWH_ch_07_pr_07 {
    static void pattern_rect(int row) {
        if (row > 0) {
            for (int i = row; i >= 1; i--) {
                System.out.print("*" + " ");
            }
            System.out.println();
            pattern_rect(row - 1);

        }

    }

    public static void main(String[] args) {
        System.out.println("Please enter the no of rows: ");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        pattern_rect(row);
        sc.close();
    }
}
