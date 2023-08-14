import java.util.Scanner;
public class Book_ch_02_pr_10 {
    public static void main(String[] args) {
        System.out.println("1)Amount invested in first year\t2)year1\t3)year2\t4)year3\t5)rate 1st year\tt6)rate 3rd year\t7)lost");
        Scanner sc=new Scanner(System.in);
        float amount =sc.nextFloat();
        float year1=sc.nextFloat();
        float year2=sc.nextFloat();
        float year3=sc.nextFloat();
        float rate1=sc.nextFloat();
        // float rate2=sc.nextFloat();
        float rate3=sc.nextFloat();
        float lost=sc.nextFloat();
        float a=amount*(1+rate1/100);
        float b=a-500;
        float c=b*(1+rate3/100);
        System.out.printf("The amount invested by user is %f\n",amount);
        System.out.printf("The amount after %f years is %f with rate of interest %f\n",year1,a,rate1);
        System.out.printf("The amount after %f years is %f lose of %f\n",year2,b,lost);
        System.out.printf("The amount after %f years is %f with rate of interest %f\n",year3,c,rate3);
        sc.close();

    }
}
