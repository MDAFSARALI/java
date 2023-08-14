import java.util.Scanner;
public class pattern_binary_triangle {
    public static void main(String[] args) {
        System.out.println("Please enter the no of rows: ");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        for (int i = 1; i <=rows; i++) {
            for(int j=1;j<=i;j++){
                if ((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
