/*  Write a java program to calculate percentage of a given students in 
CBSE board exam =.His marks from 5 subjects must be taken as input from the keyboard.(marks are out of 100)?
*/
import java.util.Scanner;
public class CWH_lec_06_exercise_1 {
    public static void main(String[] args) {
        System.out.println("Please enter the marks of following subjects:");
        System.out.println("1)Hindi\t 2)English\t 3)Math\t 4)Physics\t 5)Chemistry");
        Scanner sc=new Scanner(System.in);
        int Hindi=sc.nextInt();
        int English=sc.nextInt();
        int Math=sc.nextInt();
        int Physics=sc.nextInt();
        int Chemistry=sc.nextInt();
        int percentage=(Hindi+English+Math+Physics+Chemistry)/5;
        System.out.println("The average of the student is :"+ percentage);
        sc.close();
    }
}
