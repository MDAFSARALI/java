import java.util.Scanner;
public class CWH_lect_22_quick_quiz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a natural number: ");
        int number=sc.nextInt();
        System.out.println("--------------------------------");
        int i=1;
        do {
            System.out.println(i);
            i++;
        } while (i<=number);
        sc.close();
    }
}
