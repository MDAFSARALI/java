class negativeRadiusException extends Exception{
    public String toString(){
        return "Radius can not be negative...";
    }
    @Override
    public String getMessage(){
        return "Radius can not be negative...";
    }
}
public class CWH_lect_84_Throw_vs_throws {
    public static double area(double radius) throws negativeRadiusException{
        if (radius<0) {
            throw new negativeRadiusException();
            
        }
        double result=Math.PI*radius*radius;
        return result;
    }
    public static int devide(int a,int b) throws ArithmeticException {
        int result=a/b;
        return result;
        
    }
    public static void main(String[] args) {
        try {
            int c=devide(4,0);
        System.out.println(c);
        } catch (Exception e) {
            System.out.println("Exception...");
        }
        try {
            System.out.println(area(-2));
        } catch (negativeRadiusException e) {
            System.out.println(e);
            // e.printStackTrace();
        }
        
    }
}
