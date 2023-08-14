// import java.util.Scanner;
public class CWH_ch_05_pr_02 {
    public static void main(String[] args) {
        // System.out.println("Please enter the value of n upto which you need the sum of first n natural number :");
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int sum=0;
        // int i=1;
        // while (i<=n) {
        //     if (i%2==0) {
        //         sum=sum+i;
        //     }
        //     i++;
        // }
        // System.out.println("The sum of first even natural number is :"+sum);
        // sc.close();



        //  By HARRY:
        int sum=0;
        int n=4;
        for (int i = 0; i < n; i++) {
            sum=sum+(2*i);
        }
        System.out.print("Sum of even number is : ");
        System.out.println(sum);
        
    }

   
}
