import java.util.Scanner;
public class pattern_diamound {
    public static void main(String[] args) {
        System.out.println("Please enter no of rows: ");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        for (int i=1;i<=rows;i++){
            for (int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=rows;i>=1;i--){
            for (int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
 
}
