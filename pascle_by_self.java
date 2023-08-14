import java.util.Scanner;
public class pascle_by_self {
    public static void main(String[] args) {
        System.out.println("Enter no of rows: ");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int space=rows;
        int number=1;
        for (int i = 0; i <=rows; i++) {
            for (int j = 0; j <=space; j++) {
                System.out.print(" ");
            }
            
            number=1;
            for (int j = 0; j <=i; j++) {
                System.out.print(number+" ");
                number=number*(i-j)/(j+1);
            }
            space--;
            System.out.println();
            sc.close();
        }
    }
}
