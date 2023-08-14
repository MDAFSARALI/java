import java.util.Scanner;

public class CWH_ch_06_pr_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to check: ");
        int no = sc.nextInt();
        int[] marks = { 10, 20, 30, 40, 50, 60, 22 };
        boolean isInArray = false;
        for (int element : marks) {
            if (no == element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("Yes the entered number is present in the array....");
        } else {
            System.out.println("No the eneterd number is not present in the array..");
        }

        sc.close();
    }

}
