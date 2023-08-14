import java.util.Scanner;
public class pattern_solid_rhombus {
    public static void main(String[] args) {
        System.out.println("Please enter the no of rows: ");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        for (int i=1;i<=rows;i++){
            for (int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
                for (int k=rows;k>=1;k--){
                    System.out.print("*");
                }
                System.out.println();
            
            sc.close();
        }
    }
}
