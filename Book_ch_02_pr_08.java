import java.util.Scanner;
public class Book_ch_02_pr_08 {
    public static void main(String[] args) {
        System.out.println("Enter the floowing info:1)Resistance--01\t2)Resistance--02\t3)Resistance--03");
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        int r2=sc.nextInt();
        int r3=sc.nextInt();
        int equivalent=r1+r2+r3;
        System.out.printf("The equivalent resistance of Resistance--01=%d, Resistance--02=%d and Resistance--03=%d is %d",r1,r2,r3,equivalent);
        sc.close();
    }
}
