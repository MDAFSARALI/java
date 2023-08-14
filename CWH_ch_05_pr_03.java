import java.util.Scanner;
public class CWH_ch_05_pr_03 {
    public static void main(String[] args) {
        System.out.println("Please enter the number :");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        System.out.printf("The multiplication table of %d is:\n",no);
        for (int i = 1; i <=10; i++) {
            System.out.printf("%d X %d =%d\n",no,i,no*i);
        }
        sc.close();
    }
}
