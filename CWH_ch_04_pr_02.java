
import java.util.Scanner;
public class CWH_ch_04_pr_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter marks of following marks:");
        System.out.println("1)Urdu\t 2)English\t 3)Math");
        int  Urdu=sc.nextInt();
        int English=sc.nextInt();
        int Math=sc.nextInt();
        float total=(Urdu+English+Math)/3.0f;
        if (Urdu>=33 && English>=33 && Math>=33 && total>=40) {
            System.out.println(" Congratulation! You Have passed The exam ..........");
        }
        else{
            System.out.println("Sorry! You Have not  passed The exam .......... ");
        }
        sc.close();
    }
}
