public class CWH_ch_02_operators {
    public static void main(String[] args) {
        int a = 4;
        int b = a + 6;
        System.out.println(b);
        System.out.println(2 & 3);// Here we have done bitwise operation
        /*
         * 10-------->2
         * 11-------->3
         * --------------
         * 10 (I think here one and operator is used for addition in binary....)
         * 
         */
        System.out.println(2 | 3);
        System.out.println(8.0%1.0);// Float ke sath bhi reminder wala process kar sakte hai ----
        char c='a';
        int d=5;
        int e=c+d;
        System.out.println(e);// here the output is 102 because 'a' is converted to ascii value and asii value of a is 97 so 97+5 is 102....


    }
}
