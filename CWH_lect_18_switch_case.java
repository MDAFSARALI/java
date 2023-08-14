import java.util.Scanner;

public class CWH_lect_18_switch_case {
    public static void main(String[] args) {
        System.out.println("Please enter your age........");
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();
        switch (age) {
            case 18:
                System.out.println("Yor are going to become adult......");
                break;
            case 23:
                System.out.println("Yor are going to join a job......");
                break;
            case 60:
                System.out.println("Yor are going to get retired......");
                break;
            default:
                System.out.println("Enjoy your life.......");
                break;
        }
        System.out.println(("Thanks for using my java code----------"));
        sc.close();
    }
}
//  The concept of inhance switch (benifint: It does not required the break key word)-------->in Intelli IJ so plaese stude that from the notes

