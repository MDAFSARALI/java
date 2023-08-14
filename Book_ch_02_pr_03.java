import java.util.Scanner;
public class Book_ch_02_pr_03 {
    public static void main(String[] args) {
        System.out.println("Please the price: ");
        Scanner sc= new Scanner(System.in);
        float price=sc.nextFloat();
        float tax=0.1235f*price;
        float total_price=price+tax;
        System.out.printf("The price of the item is %f  and tax on it is %f:\n",price,tax);
        System.out.printf("You have to pay total %f including all taxes.....\n",total_price);
        sc.close();
    }

}
