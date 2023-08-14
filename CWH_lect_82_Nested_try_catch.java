import java.util.Scanner;
public class CWH_lect_82_Nested_try_catch {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 7;
        array[1] = 56;
        array[2] = 6;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index of the array which you need: ");
        int ind=sc.nextInt();
        sc.close();
        try {
            System.out.println("Welcome to video no 82");
            try {
                System.out.println(array[ind]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Sorry this index does not exist...");
                System.out.println("Exception in level 2...");

            }
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }

}
