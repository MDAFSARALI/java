import java.util.Scanner;

public class pattern_number_pyramid {
    public static void main(String[] args) {
        // int number = 1;
        System.out.println("Please enter the no.of rows: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j=1;j<=i;j++){
                 //System.out.print(number+" ");
                System.out.print(i+" ");// Here  we have to print the number of rows....
            }
            System.out.println();
            // number++;
        }
        sc.close();
    }
}
