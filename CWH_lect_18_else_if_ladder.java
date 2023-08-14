import java.util.Scanner;

public class CWH_lect_18_else_if_ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// Object creation of the scanner.....
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();
        if (age > 56) {
            System.out.println("You are experienced!!!");
        } else if (age > 46) {
            System.out.println("You are semi-experienced !!!");
        } else if (age > 36) {
            System.out.println("You are semi-semi-experienced !!!");
        } else {
            System.out.println("You are not experienced!!!");
        }
        sc.close();
    }

}
