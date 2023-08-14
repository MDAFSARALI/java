import java.util.Scanner;
public class CWH_ch_06_pr_01 {
    public static void main(String[] args) {
        System.out.println("Please enter the number of arrays:");
        float []array=new float[5];
         float sum=0;
        Scanner sc=new Scanner(System.in);
        for (int index = 0; index < array.length; index++) {
            float a=sc.nextFloat();
            sum+=a;
        }
        System.out.println("The sum is :"+sum);
        sc.close();
        // OTHER METHOD:::::::::::::::::::::::::::::::::::::;
        // for (float element : array) {
        //     sum=sum+element;
            
        // }
        // System.out.printf("The sum is %f:",sum);
        
        /*array[0]=2.0f;
        array[1]=4.0f;
        array[2]=6.0f;
        array[3]=8.0f;
        array[4]=10.0f;
        System.out.println("The sum is :"+(array[0]+array[1]+array[2]+array[3]+array[4]));*/
    }
}
