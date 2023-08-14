public class CWH_lect_85_finally_block {
    public static int greet() {
        try {
            int a = 50;
            int b = 0;
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println("Here is an exception:   " + e);
        } finally {
            // Finally block will be run at any cost...Either the code goes in try block or
            // in catch block
            System.out.println("This is the end of the function...");
        }
        return -1;

    }

    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);
        int a = 7;
        int b = 3;
        while (true) {
            try {
                int c = a / b;
                System.out.println(c);

            } catch (Exception e) {
                System.out.println(e);
                break;// Here it does not breaked it has executed the finally block then it will
                      // break;

            } finally {
                System.out.println("At any cost I will run...");

            }
            b--;
        }
        try{
            System.out.println(a/b);
        }
        finally{
            System.out.println("Chal gaya na ....");
        }
    }
}


// We can use try finally block :Except of catch block matlab catch block ke ilawa hm log try and finally block likh sakte hai...
// try {

// } 
// finally {

// }
