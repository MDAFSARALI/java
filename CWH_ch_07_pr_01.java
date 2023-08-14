import java.util.Scanner;
public class CWH_ch_07_pr_01 {
    static void multiplication(int x) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d =%d", x, i, x * i);
            System.out.println();
        }

    }

    public static void main(String[] args) {
        System.out.println("Please enter the number: ");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("The multiplication table of %d is: ", n);
        System.out.println();
        multiplication(n);
        sc.close();
    }
}
