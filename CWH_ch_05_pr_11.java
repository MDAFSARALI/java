import java.util.Scanner;

public class CWH_ch_05_pr_11 {
    public static void main(String[] args) {
        System.out.println("Please enter the value of n upto which you need the sum of first n natural number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        // for (int i = 0; i <= n; i++) {
        //     if (i % 2 == 0) {
        //         sum = sum + i;
        //     } 
        // }
        // System.out.println("The sum of first even natural number is :"+sum);
        // sc.close();


        int i = 0;
        while ( i < n) {
           
                sum = sum + 2*i;
                
                i++;
        }
        System.out.println("The sum of first even natural number is :"+sum);
        sc.close();
        }
    }