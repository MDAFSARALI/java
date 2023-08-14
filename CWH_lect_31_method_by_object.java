public class CWH_lect_31_method_by_object {
     int logic(int x, int y) {// Here we have removed the static key word thats why we have to use the object creation
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        // Method invocation using object reation .........
        CWH_lect_31_method_by_object obj=new CWH_lect_31_method_by_object();
        int c;
        c = obj.logic(a, b);
        System.out.println(c);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<**********************>>>>>>>>>>>>>>>>>>>>>>>>>");
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = obj.logic(a1, b1);
        System.out.println(c1);
        
    }
}
