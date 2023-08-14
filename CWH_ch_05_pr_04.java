import java.util.Scanner;
public class CWH_ch_05_pr_04 {
    public static void main(String[] args) {
        System.out.println("Enter the number for which you need reverse multiplication table:");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        System.out.printf("The multiplication table %d in reverse order:\n",no);
        for (int i = 10; i >= 1; i--) {
            System.out.printf("%d x %d = %d\n",no,i,no*i);
        }
        sc.close();
    }
}
