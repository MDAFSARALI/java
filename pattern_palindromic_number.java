import java.util.Scanner;
public class pattern_palindromic_number {
    public static void main(String[] args) {
        System.out.println("Please enter the no of rows: ");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            // for (int j=rows-i;j>=1;j--){
            //         System.out.print("  ");// Here i have added 2 spaces to see the output in better manner 
            // }
            for (int j=1;j<=rows-i;j++){
                System.out.print("  ");
        }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for (int j=2;j<=i;j++){
                System.out.print( j+" "); // Here i have added a new oe extra space before j to see the output in better manner
            }
            System.out.println();
        }  
        sc.close();
    }
}
//  The above instruction regarding the pattern can also be done by removing spcaes before j in line 15 and by decreasing the 1 space from the line 9 simulataneouslu..........
//  Either use 8 to 10 or 11 to 13 dono me se kuch ak use karna hoga ...........................