public class CWH_lect_34_recursion {
    static int factorial(int n) {
        // factorial zero is 1
        // factorial (n)=n*n-1*n-2*....1
        // factorial(5)=5*4*3*2*1=120
        // factorial (n)=factorial(n-1)!*1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }
    static int factorial_Itterativeapproch(int n){
        if (n == 0 || n == 1) {
            return 1;
        } else {
             int product =1;
             for (int i = 1; i <= n; i++) {
                product*=i;
             }
             return product;
        }

    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println("The value of factororial n is :" + factorial(x));
        System.out.println("The value of factororial n is :" + factorial_Itterativeapproch(x));
    }
}
