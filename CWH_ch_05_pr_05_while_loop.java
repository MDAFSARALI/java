import java.util.Scanner;
public class CWH_ch_05_pr_05_while_loop {
   public static void main(String[] args) {
    System.out.println("Enter the number for which you need reverse multiplication table:");
    Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int i=10;
        System.out.printf("The multiplication table %d in reverse order:\n",no);
        while (i>=1) {
            System.out.printf("%d x %d = %d\n",no,i,no*i);
            i--;
        }
        sc.close();
   } 
}
