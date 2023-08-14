import java.util.Scanner;
public class Book_ch_02_pr_04 {
    public static void main(String[] args) {
        System.out.println("please enter the no of hours you have worked!...\t and basic hourly salary....");
        Scanner sc=new Scanner(System.in);
        int hour=sc.nextInt();
        int hourly_salary=sc.nextInt();
        int total_salary=hour*hourly_salary;
        System.out.printf("You have worked %d hours with hourly salary %d:\n",hour,hourly_salary);
        System.out.printf("Your total pay due is :%d",total_salary);
        sc.close();
    }
}
