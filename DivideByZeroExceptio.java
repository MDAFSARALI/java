import java.util.Scanner;
public class DivideByZeroExceptio {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=input.nextInt();
        System.out.println("Enter the value of b:");
        int b=input.nextInt();
        int c=0;
        try {
            System.out.println("Here division occured:");
            c=a/b;
            try {
                if (c==-1) {
                    System.out.println("Exception occured: ");

                }
            } catch (ArithmeticException f) {
                System.out.println("Some Arithematic Exception occured:");
            }
        } catch (Exception e) {
           System.out.println("New Exception:");
        }
        finally{
            System.out.println("The quetient is :"+c);
        }
        input.close();
    }
}
