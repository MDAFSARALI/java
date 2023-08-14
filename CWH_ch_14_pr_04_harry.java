import java.util.Scanner;

class myException extends Exception {
    public String exceed() {
        return "You have exceeded the limit...";
    }
}
public class CWH_ch_14_pr_04_harry {
    public static void main(String[] args) {

            int [] arr=new int [5];
            arr[0]=10;
            arr[1]=20;
            arr[2]=30;
            arr[3]=40;
            arr[4]=50;
            boolean flag=true;
            int i=0;
            Scanner sc=new Scanner(System.in);
            while (flag && i<5) {
                try {
                    System.out.println("Enter the index: ");
                int index=sc.nextInt();
                System.out.println("The value of array[index] is :"+arr[index]);
                break;
                    
                } catch (Exception e) {
                    System.out.println("Invalid index ...");
                    i++;
                }  
            }
    }
    // Question 3 ,4 and 5 are normal but harry take it in normal way...
}
