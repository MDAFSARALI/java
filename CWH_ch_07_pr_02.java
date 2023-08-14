import java.util.Scanner;
public class CWH_ch_07_pr_02 {
    static void star_pattern(int rows){
        for (int i = 1; i <=rows; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }





    public static void main(String[] args) {
        System.out.println("Please enter the no of rows: ");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        System.out.printf("The star pattern of rows %d is :",rows);
        System.out.println();
        star_pattern(rows);
        sc.close();
    }
}
