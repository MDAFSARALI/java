import java.util.Scanner;

public class CWH_ch_04_pr_03 {
    
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Please Enter the correct salary :");
    //     float amount = sc.nextFloat();
    //     if (amount < 250000) {
    //         System.out.println("You are not eligible to pay the tax......");
    //     } else if (amount >= 250000 && amount < 500000) {
    //         System.out.println("You have to pay the tax : " + (0.05 * (amount - 250000)));
    //     } else if (amount >= 500000 && amount < 1000000) {
    //         System.out.println("You have to pay the tax : " + (0.20 * (amount - 250000)));
    //     } else {
    //         System.out.println("You have to pay the tax : " + (0.30 * (amount - 250000)));
    //     }
    //     sc.close();
    // }


    //  --------------------------By Harry------------------------------------------------------------------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the correct salary in lakh :");
        float tax=0;
        float income=sc.nextFloat();
        if (income<2.5){
            tax= (float) (tax+ 0.05 *(income-2.5));
        } 
        else if (income>2.5f && income<5.0f){
            tax= (float) (tax+(5.0f-2.5f) );
            tax=(float) (tax+0.20f*(0.05 *(income-5)));
        }
        else if (income>10f){
            tax=tax+0.05f*(5f-2.5f);
            tax=(float) (tax+0.20f*(10f-5f));
            tax= (float) (tax+ 0.03 *(income-10.0f));
        }
            System.out.println("The total tax paid by the employee is: "+tax);
            sc.close();
        
    }
    
} 
