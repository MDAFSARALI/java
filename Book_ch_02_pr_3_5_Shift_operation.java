import java.util.Scanner;

public class Book_ch_02_pr_3_5_Shift_operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value of x and y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("LEFT SHIFT :" + x + "<<" + y + "=" + (x << y));
        System.out.println("RIGHT SHIFT :" + x + ">>" + y + "=" + (x >> y));
        System.out.println(" UNSIGNED LEFT SHIFT :" + x + ">>>" + y + "=" + (x >> y));
        // NEGATIVE NUMBER:
        System.out.println("RIGHT SHIFT : -" + x + ">>" + y + "=" + (-x >> y));
        System.out.println(" UNSIGNED RIGHT SHIFT :-" + x + ">>>" + y + "=" + (-x >>> y));
        System.out.println(" LEFT SHIFT :-" + x + "<<" + y + "=" + (-x << y));
        // Negative shift distance of -31 actually means shifting 1 bit
        System.out.println("LEFT SHIFT: " + x + "<<-31=" + (x << -31));
        sc.close();
    }

}
