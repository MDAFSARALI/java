import java.util.Scanner;
public class CWH_ch_07_pr_10 {
    static int add(int x) {
    int sum = 0;
    for (int i = 1; i <= x; i++) {
         sum += i;

    }
    return sum;
}

public static void main(String[] args) {
    System.out.println("Please enter the number upto which you want to add: ");
    Scanner sc = new Scanner(System.in);
    int no = sc.nextInt();
    System.out.printf("The sum of first %d naturalnumber is :", no);
    System.out.println();
    int ans = add(no);
    System.out.print(ans);
    sc.close();

}
}

