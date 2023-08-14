import java.util.Scanner;
public class Book_ch_2_pr_05 {
    public static void main(String[] args) {
        System.out.println("please enter the integer no: ");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int fact=1; 
        if(no==0){
            System.out.printf("The factorial of %d is 1",no);
        }
        else{ 
        for (int i = 1; i <=no; i++) {
            fact=fact*i;
        }
            System.out.printf("The factorial of the %d is %d: ",no,fact);
        }
        sc.close();
    }
}
