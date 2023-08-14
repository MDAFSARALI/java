import java.util.Scanner;
public class Book_ch_02_pr_06 {
    public static void main(String[] args) {
        System.out.println("Enter the length in inches: ");
        Scanner sc=new Scanner(System.in);
        float inches=sc.nextFloat();
        float centimeter=2.54f*inches;
        System.out.printf("Inches=%f \t  centimeter=%f",inches,centimeter);
        sc.close();
    }
}
