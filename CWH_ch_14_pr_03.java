import java.util.Scanner;


public class CWH_ch_14_pr_03 {
    public static void main(String[] args) {
        int [] arr=new int [5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        boolean flag=true;
        int i=1;
        Scanner sc=new Scanner(System.in);
        while (flag==true ) {
            System.out.println("Enter the index:");
            int index=sc.nextInt();
            try {
                if (i<=5) {
                    System.out.println(arr[index]); 
                    flag=false;   
                }
            }
            catch(Exception e){
                System.out.println("Error...");
            }
            finally{
                System.out.println("Thanks....");
            } 
            i++; 
        }
        
        sc.close();
    }
}
