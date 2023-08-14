import java.util.Scanner;
public class CWH_ch_04_pr_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the year: ");
        int year=sc.nextInt();
        if (year%400==0 && year%100==0 && year%4==0){
            //System.out.printf("The Entered year %d is a leap year",year);
            System.out.format("The Entered year %d is leap year", year);
        }
        else{
            System.out.printf("The Entered year {%d} is not a leap year",year);
        }
            sc.close();
    }
}
