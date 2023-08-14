public class CWH_lect_33_variable_arguments {
    // static int sum(int a, int b) {
    // return a + b;
    // }

    // static int sum(int a, int b, int c) {
    // return a + b + c;
    // }

    // static int sum(int a, int b, int c, int d) {
    // return a + b + c + d;
    // }
    // To reduce the types of method of same type we generally use var arguments
    // mathod...
    /*
     * static int sum(int... arr) {// Here triple dots are use to add the all values
     * in an array...
     * // Available as int []arr;
     * int result = 0;
     * for (int a : arr) {
     * result += a;
     * }
     * return result;
     * }
     * 
     * public static void main(String[] args) {
     * System.out.println("Welcome to varargs Tutorial");
     * System.out.println("The sum of 4 and 5 is :" + sum(4,5));
     * System.out.println("The sum of 4,3 and 5 is :" + sum(4, 3, 5));
     * System.out.println("The sum of 2,4,3 and 5 is :" + sum(2, 4, 3, 5));
     * System.out.println("The sum of 1,2,4,3 and 5 is :" + sum(1, 2, 4, 3, 5));
     */

    static int sum(int x, int... arr) {// If we want to add atleast 1 arguments from the use then ...

        int result = x;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to varargs Tutorial");
        System.out.println("The sum of 4 and 5 is :" + sum(1));// We must have to pass atleast 1 arguments....
        System.out.println("The sum of 4,3 and 5 is :" + sum(4, 3, 5));
        System.out.println("The sum of 2,4,3 and 5 is :" + sum(2, 4, 3, 5));
        System.out.println("The sum of 1,2,4,3 and 5 is :" + sum(1, 2, 4, 3, 5));
    }
}
