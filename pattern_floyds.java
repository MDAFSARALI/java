import java.util.Scanner;
public class pattern_floyds {
    public static void main(String[] args) {
        int Number=1;
        System.out.println("Please enter the no of rows: ");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        for (int i = 1; i <=rows; i++) {
            for(int j=1;j<=i;j++){
                System.out.print(Number+" ");
                Number++;
            }
            System.out.println();
        }
        sc.close();
    }
}
