import java.util.Scanner;

public class pattern_pascals_tiangle {
    public static void main(String[] args) {
        System.out.println("Please enter the no of rows: ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int space = no;
        int Number = 1;
        for (int i = 0; i < no; i++) {
            for (int s = 0; s <= space; s++) {
                System.out.print(" ");
            }
            Number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(Number + " ");
                Number = Number * (i - j) / (j + 1);

            }
            space--;
            System.out.println();

        }
        sc.close();
    }
}
