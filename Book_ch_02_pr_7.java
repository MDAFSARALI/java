import java.util.Scanner;

public class Book_ch_02_pr_7 {
    public static void main(String[] args) {
        System.out.println("Enter the length:1)Enter in acres\t2)Enter in hactares ");
        Scanner sc=new Scanner(System.in);
        float hectares=sc.nextFloat();
        float acres=sc.nextFloat();
         float total_acres=2.471f*hectares;
         float total_hecttares=0.404686f*acres;
         System.out.printf("%f acres in hector is %f\n",acres,total_hecttares);
         System.out.printf("%f hectares in acres is %f",hectares,total_acres);
         sc.close();
    }
}
