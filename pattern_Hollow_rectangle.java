import java.util.Scanner;
public class pattern_Hollow_rectangle {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the following info:1)No of rows:\t  2) No of coloum:");
            int row = sc.nextInt();
             int coloum = sc.nextInt();
            for (int i = 1; i <= row; i++) {
                    for (int j = 1; j <=coloum; j++) {
                        if (i==1 || i== row || j==1 || j==coloum) {
                            System.out.print("*");  
                            
                        }
                        else{
                            System.out.print(" ");
                    }
                    }
                    System.out.println();
            }
            sc.close();
        }
    }
    

