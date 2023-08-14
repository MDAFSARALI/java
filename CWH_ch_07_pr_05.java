
// import java.util.Scanner;
public class CWH_ch_07_pr_05 {
    /*static int fibonacci(int x) {
        if (x == 0 || x == 1) {
            return x;
        } else {
            int sum = fibonacci(x - 2) + fibonacci(x - 1);
            return sum;
        }

    }



    public static void main(String[] args) {
        System.out.println("Please enter the no of position for which you need fibonacci series(starting with zero): ");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        System.out.printf("The fibonacci series at position %d is: %d", no, fibonacci(no));
        sc.close();


        
    }*/


    // By Harry
static int fibonacci(int n){
    // Short method...
    if (n==1 || n==2) {
        return n-1;
    }
    // if (n==1) {
    //     return 0;
    // }
    // else if (n==2) {
    //     return 1;
    // }
    else{
        return fibonacci(n-2)+fibonacci(n-1);
    }
}

public static void main(String[] args) {
    // Here the staring with index 1;
    int result=fibonacci(3);
    System.out.println(result);
}


}
