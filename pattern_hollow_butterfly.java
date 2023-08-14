import java.util.Scanner;
// Bhaiya rat lo.......
public class pattern_hollow_butterfly {
    public static void main(String[] args) {
        System.out.println("Plese eneter the no of rows:");
        Scanner sc=new Scanner(System.in);

        System.out.println("*");
        int n =sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
            for (int j = 1; j <= i - 2; j++) {
                System.out.print(" ");
            }
            if (i > 1) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <= i - 2; j++) {
                System.out.print(" ");
            }
            if (i > 1) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = n; i >= 1; i--) {
            System.out.print("*");
            for (int j = 1; j <= i - 2; j++) {
                System.out.print(" ");
            }
            if (i > 1) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <= i - 2; j++) {
                System.out.print(" ");
            }
            if (i > 1) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
