import java.util.Scanner;

public class CWH_lect_82_nested_try_catch_Quik_quiz {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        Scanner sc = new Scanner(System.in);
        Boolean flag = true;
        while (flag) {
            System.out.println("Enter the index:");
            int index = sc.nextInt();
            try {
                System.out.println("Welcome to video no 82");
                try {
                    System.out.println(marks[index]);
                    flag=false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exist...");
                    System.out.println("Exception in level 2...");
    
                }
            }
            catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Thanks for using the code...");
          

        }
        sc.close();
    }
}
