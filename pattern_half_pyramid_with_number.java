import java.util.Scanner;
public class pattern_half_pyramid_with_number {
    public static void main(String[] args) {
        System.out.println("Please enter the number of row: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
