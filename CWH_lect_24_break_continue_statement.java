public class CWH_lect_24_break_continue_statement {
    public static void main(String[] args) {
        // ___________________________Break and continue using
        // loops_______________________
        /*
         * for (int i=0;i<5;i++){
         * System.out.println(i);
         * System.out.println("Java is great!!");
         * if (i==2){
         * System.out.println("Ending the loop");
         * break;// It breakouts the loop.........Irrespective of wether the condition
         * is true or false
         * }
         * }
         * 
         * 
         * System.out.println("Here the loop ends............");
         */

        // _______________________________Using break and continue in while
        // loop__________________

        // int i=0;
        // while (i<5) {
        // System.out.println(i);
        // System.out.println("Java is great!!");
        // if (i==2){
        // System.out.println("Ending the loop");
        // break;// It breakouts the loop.........Irrespective of wether the condition
        // is true or false
        // }
        // i++;
        // }
        // }

        // _______________________________Using break and continue ns while
        // loop__________________
        // int i=0;
        // do {
        // System.out.println(i);
        // System.out.println("Java is great!!");
        // if (i==2){
        // System.out.println("Ending the loop");
        // break;// It breakouts the loop.........Irrespective of wether the condition
        // is true or false
        // }
        // i++;
        // } while ( i<5);
        // System.out.println("Loops ends here...");

        // ___________________________Continue using in for loops_______________________
        /*
         * for (int i=0;i<5;i++){
         * 
         * if (i==2){
         * System.out.println("Ending the loop");
         * continue;// After looking at this the code goes for next itteration(for the
         * next value) without looking the below code _________2 ke liye print hi nahi
         * kia use kad 3 ke liye chala gaya/////
         * 
         * }
         * System.out.println(i);
         * System.out.println("Java is great!!");
         * }
         * 
         * 
         * System.out.println("Here the loop ends............");
         */

        // _______________________________Using continue in while
        // loop__________________Some problem------

        // int i=0;
        // while (i<5) {
        // System.out.println("Loops ends here");
        // if (i==2){
        // System.out.println("Ending the loop");
        // continue;
        // }
        // System.out.println(i);
        // System.out.println("Java is great!!");
        // i++;

        // }
        // }

        // _______________________________Using continue in do while
        // loop__________________

        int i = 0;
        do {
            i++;
            if (i == 2) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great!!");
        } while (i < 5);
        System.out.println("Loops ends here...");

    }
}
