import java.util.Scanner;

public class Book_ch_02_pr_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Decimal number: ");
        int decimalNo = sc.nextInt();
        System.out.print("Binary equivalent of " + decimalNo + " is: ");
        System.out.print(Integer.toBinaryString(decimalNo));// This can not be store into any variable we must have to
                                                            // diplay it directly...
        System.out.println("..............................................................");
        System.out.println("Please enter the Binary number: ");
        String BinaryNo = sc.next();
        System.out.print("Decimal equivalent of " + BinaryNo + " is: ");
        System.out.print(Integer.parseInt(BinaryNo, 2));
        sc.close();
    }
}
