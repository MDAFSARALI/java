import java.util.Scanner;
public class pattern_half_pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("PLesae enter the following info:1) No of row: ");
        int row=sc.nextInt();
        // int coloum=sc.nextInt();
        for (int i=1;i<=row;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print(" * ");
            }
           System.out.println(); 
        }
        sc.close();
    }
    
}
 