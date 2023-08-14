import java.util.Scanner;
public class CWH_ch_14_pr_02_new {
    public static int  devide(int a,int b) {
        int c=a/b;
        return c;  
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the value of a and b : ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        
        try {
            int z=devide(x, y);
            System.out.println(z);
            
        } catch (ArithmeticException e) {
            System.out.println("********HAHA***********");
        }
        catch(IllegalArgumentException f){
            System.out.println("**********HEHE**********");
        }
        finally{
            System.out.println("Thanks for using the code...");
        }
        
    }

    
    
}
