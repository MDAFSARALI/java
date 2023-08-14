import java.util.Scanner;

public class Book_ch_02_pr_01_Bitwise_operation {
    public static void main(String[] args) {
        System.out.println("Please enter the no of rows: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            if (i % 2 == 0) {
                System.out.print("  ");
                System.out.print("****");
            } else {
                System.out.print("****");
            }
            System.out.println();
            sc.close();
        }
    }
}
