import java.util.Scanner;

public class Book_ch_02_ex_3_1 {
    public static void main(String[] args) {
        System.out.println("Please enter the value of a and b: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Addition of two variables:
        System.out.println("Sum: " + a + " + " + b + "=" + (a + b));
        // Substraction of two variables:
        System.out.println("Substraction: " + a + " - " + b + "=" + (a - b));
        // Multiplication of two variables:(Multiplication of a with b)
        System.out.println("Multiplication: " + a + " X " + b + "=" + (a * b));
        // Division of two variables:
        System.out.println("Division: " + a + " / " + b + "=" + (a / b));
        // Reminder of two variables:
        System.out.println("Reminder: " + a + " % " + b + "=" + (a % b));
        // a and b can be added and the result can be palced in "a"....
        // Let us seeHow?
        a += b;
        System.out.println("Adding b to a and storing the result in a: " + a);
        sc.close();

    }
}
