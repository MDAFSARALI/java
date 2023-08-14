import java.util.Scanner;

class FibonacciThread extends Thread {
    private int n;

    public FibonacciThread(int n) {
        this.n = n;
    }

    public void run() {
        int a = 0, b = 1;
        System.out.println("Fibonacci series for " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.println("Fibbonacci no: "+a + " ");
            int temp = b;
            b = a + b;
            a = temp;
            try {
                Thread.sleep(100); // Add a delay of 100ms between each iteration
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class PrimeThread extends Thread {
    private int n;

    public PrimeThread(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("\nPrime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Prime number :"+i + " ");
            }
            try {
                Thread.sleep(500); // Add a delay of 500ms between each iteration
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        FibonacciThread fibThread = new FibonacciThread(n);
        PrimeThread primeThread = new PrimeThread(n);
        fibThread.start();
        primeThread.start();
        sc.close();
    }
}
