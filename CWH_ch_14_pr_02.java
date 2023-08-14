import java.util.Scanner;

public class CWH_ch_14_pr_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a and b: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        try {
           int c=a/b;
           System.out.println(c); 
        } catch (ArithmeticException x) {
            System.out.println("HAHA");
            System.out.println(x);
        }
        catch(IllegalArgumentException y){
            System.out.println("HEHE");
        }
        finally{
            System.out.println("Thanks for using the program...");
        }
        sc.close();
    }
}
