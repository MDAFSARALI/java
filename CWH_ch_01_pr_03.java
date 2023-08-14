
// Write a java program which asks the user to enter his/her name and greet them with "Hello <name> , have a good day" text
import java.util.Scanner;

public class CWH_ch_01_pr_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your name:  ");
        String a = sc.nextLine(); // if we use only next then only the first name will be taken thats why we have
                                  // used nextline to take enter of full name ....
        System.out.println("Hello " + a + ", have a good day!!");
        sc.close();

    }
}
