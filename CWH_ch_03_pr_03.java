import java.util.Scanner;
public class CWH_ch_03_pr_03 {
    public static void main(String[] args) {
        System.out.println("Please Enter your name: ");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String templet="Dear <|name|>, Thanks a lot";
        System.out.println(templet.replace("<|name|>", name));
        sc.close();
    }
}
