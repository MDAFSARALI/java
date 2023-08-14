import java.util.Scanner;
public class number_pyramid_by_microsoft_wali_didi {
    public static void main(String[] args) {
        System.out.println("Please enter the no.of rows: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for (int i=1;i<=rows;i++){
            for (int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
