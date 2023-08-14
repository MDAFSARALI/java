import java.util.Scanner;
public class pattern_butterfly {
    public static void main(String[] args) {
        System.out.println("Please enter the number of rows: ");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        for (int i=1;i<=rows;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*"); 
            }
            for(int k=1;k<=2*(rows-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        for (int i = rows; i >= 1; i--) {
            for (int j=1;j<=i;j++){
                System.out.print("*"); 
            }
            for(int k=1;k<=2*(rows-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(); 
        }
        sc.close();
    }
}
