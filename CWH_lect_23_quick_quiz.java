import java.util.Scanner;
public class CWH_lect_23_quick_quiz {
    public static void main(String[] args) {
        System.out.println("PLease enter the number: ");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println("--------------------------------");
        for (int i=number;i>0;i--){
            System.out.println(i);
        }
        sc.close();
    }
}
