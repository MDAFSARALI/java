/* The output of the following pattern:------------->
* * * * *
* * * * *
* * * * *
* * * * *
 */


import java.util.Scanner;

public class Pattern_solid_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the following info:1)No of rows:\t  2)No of stars:");
        int row = sc.nextInt();
        int noofstars = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= noofstars; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}
