public class CWH_lect34_fibonacci_series {
    static int fibonacci(int x) {
        if (x == 0 || x == 1) {
            return x;
        } else {
            int sum = fibonacci(x - 2) + fibonacci(x - 1);
            return sum;
        }

    }

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.printf("The fibonacci series at position %d is %d:", i, fibonacci(i));
            System.out.println();
        }

    }
}
