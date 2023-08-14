import java.util.Scanner;

public class butterfly_self {
    public static void main(String[] args) {
        System.out.println("Please enter the no of rows: ");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
// For upper half:  
        for (int i=1;i<=rows;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            int spaces=2*(rows-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
//  For lower half:

        for (int i=rows;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            int spaces=2*(rows-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
