public class CWH_lect_31_method_new {
    static int logic(int x, int y) {
        int z;
         
        if (x > y) {
            z = x + y;
            
        } else {
            z = (x + y) * 5;
        }
         x=500;
        return z;
    
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        c = logic(a, b);
        System.out.println(c);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<**********************>>>>>>>>>>>>>>>>>>>>>>>>>");
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1, b1);
        System.out.println(c1);
        // Only static method can be called without creating the object from the main
        // method...
    }
}
