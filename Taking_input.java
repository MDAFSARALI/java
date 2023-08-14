import java .util.Scanner;
public class Taking_input {
    public static void main(String[] args) {
        System.out.println("taking input from the user !!!");
        Scanner scan = new Scanner(System.in);// Reading from the key board......
        System.out.println("Enter the first number: ");
        int a=scan.nextInt();
        System.out.println("Enter the second number: ");
        int b=scan.nextInt();
         int sum=a+b;
        System.out.println("sum is :"+ sum);
        scan.close();/// ****** This line is used to close the scan because some syntax eas probleming but this is not compulsory without this the program can run perfectly;
    }

}
