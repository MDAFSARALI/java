import  java.util.Scanner;
public class pattern_half_pyramid_with_space {
    public static void main(String[] args) {
        System.out.println("Please enter the no of rows: ");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j =1; j <=rows-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
