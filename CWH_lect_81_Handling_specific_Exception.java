import java.util.Scanner;

public class CWH_lect_81_Handling_specific_Exception {
    public static void main(String[] args) {
        int [] array=new int[5];
        array[0]=7;
        array[1]=56;
        array[2]=6;
        System.out.println("Enter the array index:");
        Scanner sc=new Scanner(System.in);
        int ind=sc.nextInt();
        System.out.println("Enter the number you want to devide the value with:");
        int number=sc.nextInt();
        try {
            System.out.println("The value at array index entered is:"+array[ind]);
            System.out.println("The value of array_value/number is :"+array[ind]/number);
            
        }
         catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You have entered wrong array index...");
        }
        catch (ArithmeticException e) {
            System.out.println("May you want to devide the number by zero...");
        }
        catch (Exception e) {
            System.out.println("Some new exception....");
            System.out.println(e);
        }
        sc.close();

        
    }
}
