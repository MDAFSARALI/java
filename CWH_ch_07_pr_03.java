// import java.util.Scanner;

public class CWH_ch_07_pr_03 {

    // static int add(int x) {
    //     int sum = 0;
        
    //     for (int i = 1; i <= x; i++) {
    //         // sum += i;// This is by normal method..

    //         sum = add(x - 1) + i;// Thsi is the recursive method according to question....

    //     }
    //     return sum;
    // }

    // public static void main(String[] args) {
    //     System.out.println("Please enter the number upto which you want to add: ");
    //     Scanner sc = new Scanner(System.in);
    //     int no = sc.nextInt();
    //     System.out.printf("The sum of first %d naturalnumber is :", no);
    //     System.out.println();
    //     int ans = add(no);
    //     System.out.print(ans);
    //     sc.close();

    // }




    // Problem solved by Harry:
    static int sumRec(int n){
        // Base condition...
        if (n==1) {
            return 1;
        }
        else{
            return n+sumRec(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(sumRec(5));
    }

}
