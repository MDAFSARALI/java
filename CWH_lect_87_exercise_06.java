import java.util.Scanner;
class InvalidInputException extends Exception{
    public String InvalidInput(){
        return "You have entered the wrong input...You want to add 8 and 9"; 
    }
}
class canNotDevideByZeroException extends Exception{
        public String canNotDevideByZero (){
            return "The number can not be devide by zero";
        }
    }
class MaxInputException extends Exception{
    public String MaxInput(){
        return "Sorry! You have entered the number greater than 100000";
    }
}
class  MaxmultiplierreachedException extends Exception{
    public String Maxmultiplierreached(){
        return "You have reacherd Max Multiplier number ";
    }
}
   

class customeCalculator {
    double add(double x,double y) throws InvalidInputException{
        if (x==8 && y==9) {
            throw new InvalidInputException();
            
        }
        return x+y;
    }
    double sub(double x,double y)throws MaxInputException{
        if (y>=100000) {
            throw new MaxInputException();
        }
       
        return x-y;
    }
    double mul(double x,double y) throws MaxmultiplierreachedException{
        if (x>7000 && y>7000) {
            throw new MaxmultiplierreachedException();
        }
        return x*y;
    }
    double dev(double x,double y)throws canNotDevideByZeroException {
        if (y==0) {
            throw new canNotDevideByZeroException();
        }
        return x/y;
    }
}


public class CWH_lect_87_exercise_06 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a and b :");
            int a=sc.nextInt();
            int b=sc.nextInt();
        customeCalculator c=new customeCalculator();
        try {
            System.out.println(c.add(a, b));
        } catch (InvalidInputException e) {
            System.out.println(e.InvalidInput());
        }
        try {
            System.out.println(c.sub(a, b));
        } catch (MaxInputException e) {
            System.out.println(e.MaxInput());
        }
        try {
            System.out.println(c.mul(a, b));
        } catch (MaxmultiplierreachedException e) {
           System.out.println(e.Maxmultiplierreached());
        }
        try {
            System.out.println(c.dev(a, b));
        } catch (canNotDevideByZeroException e) {
            System.out.println(e.canNotDevideByZero());
        }
       sc.close();
        
        /*
         you have to create a custome calculator which throws the following exceptions with following operations 
         1.(+)---->Addition 
         2.(-)---->Substrcation
         3.(*)---->Multiplication
         4.(/)---->Division.
         Exceptions:
         1)Invalid Input Exception..(ex: 8 and 9)
         2)Can not devide by Zero exception
         3)Max input Exception...if any of the input is greater than 100000 
         4)Max multiplier reached Exception -->Dont allow any Multiplication input to be greater than 7000
         */
    }
}
