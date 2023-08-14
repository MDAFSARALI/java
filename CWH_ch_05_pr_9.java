import java.util.Scanner;
public class CWH_ch_05_pr_9 {
    public static void main(String[] args) {
        System.out.println("Please enter the number :");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
         int sum=0;
        System.out.printf("The multiplication table of %d is:\n",no);
        for (int i = 1; i <=10; i++) {
            sum=sum+no*i;
        }
        System.out.println(sum);
        sc.close();
    }
}

