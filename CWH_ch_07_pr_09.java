import java.util.Scanner;
public class CWH_ch_07_pr_09 {
    static float  temp(float x){
        float farenheight=(x*9/5)+32;
        return farenheight;
    }

    public static void main(String[] args) {
        System.out.println("Enter the temperature in celcius :");
        Scanner sc=new Scanner(System.in);
        float celcius=sc.nextFloat();
        float farenheight=temp(celcius);
        System.out.printf("The temperature of %f in farenheight is %f ",celcius,farenheight);
        sc.close();
    }
}
