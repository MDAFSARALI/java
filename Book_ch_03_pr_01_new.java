import java.util.Scanner;
public class Book_ch_03_pr_01_new {
    Book_ch_03_pr_01_new(){
        // int a=100;
        // int b=200;
    }
    public  int met1(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("Please enter the value of a and b: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Book_ch_03_pr_01_new book=new Book_ch_03_pr_01_new();
        System.out.println(book.met1(a, b));
        sc.close();
    }
}
