/*import java.util.Scanner;
public class pattern_rotated_by_180_degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLease enter the number of rows: ");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = row - i; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        sc.close();
    }
}
*/
//  The above code is written by myself:--------->!

//  The same ouput can be obtained by sardha didi's code:
import java.util.Scanner;
public class pattern_rotated_by_180_degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLease enter the number of rows: ");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j<=row-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        sc.close();
    }
}