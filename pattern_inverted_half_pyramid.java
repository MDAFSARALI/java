import java.util.Scanner;
public class pattern_inverted_half_pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("PLesae enter the following info:1) No of row: ");
        int row=sc.nextInt(); 
        for (int i=row;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
