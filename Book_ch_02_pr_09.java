import java.util.Scanner;
public class Book_ch_02_pr_09 {
    public static void main(String[] args) {
       System.out.println("Please enter the Resistance--01 and Resistance--02"); 
       Scanner sc=new Scanner(System.in);
       float r1=sc.nextInt();
       float r2=sc.nextInt();
       float equivalent=1/((1/r1)+(1/r2));
       System.out.printf("The equivalent resistance of Resistance--01=%f and Resistance--02=%f is %f",r1,r2,equivalent);
       sc.close();
    }
}
