public class CWH_lect_80_try_catch_block {
    public static void main(String[] args) {
        /*There are two type of Exception 
        1)Checked Exception------>It is detected by compiler during compilation
         2)Unchecked Exception
         */
        // ARITHEMATIC EXCEPTION:
        // Without  try:
        
        int a=6000;
        int b=0;
        // int c=a/b;
        // System.out.println("The result is :"+c);
        // With try block:
        try {
            int c=a/b;
            System.out.println("The result is :"+c);
        } catch (Exception e) {
            System.out.println("We are unable to devide ,Reason:");
            System.out.println(e);
            }
        System.out.println("End of the programe...");
    }
}
