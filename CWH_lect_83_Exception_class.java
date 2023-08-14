import java.util.Scanner;

class myException extends Exception{
    public String toString(){
        return "I am toString()";
    }
    @Override
    public String getMessage(){
        return " I am getMessage()";
    }
}
public class CWH_lect_83_Exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a :");
        a=sc.nextInt();
        if (a<9) {
            try{
                // throw  new myException();
                throw new ArithmeticException("this is an exception...");

            }
            catch(Exception e ){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);//it will produce the toString method which is inbuild in the class of the Exception...
                e.printStackTrace();
                System.out.println("Finished");

            }
            
        }
        

    }
}
