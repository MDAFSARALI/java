import java.util.Scanner;

public class CWH_lect_20_Exercise_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 1;
        int max = 3;
        System.out.println("Random value of type int between " + min + " to " + max + ":");
        int com = (int) (Math.random() * (max - min + 1) + min);
        //System.out.println(com);
        System.out.println("computer has already choosen the number....");
        System.out.println("Please Enter the number between 1 to 3:  1)rock\t 2)Scissor\t 3)Paper ");
        int you = sc.nextInt();
        
        if (you==com){
            System.out.println("The match has been draw!! ");
            System.out.printf("You have choosen %d\n",you);
            System.out.printf("computer have choosen %d\n",you);
        }
        else if (com==1 && you==2){
            System.out.println("You have Lost the match!!..");
            System.out.printf("You have choosen scissor \n");
            System.out.printf("computer have choosen rock");
        }
        else if (com==1 && you==3){
            System.out.println("You have Won the match!!..");
            System.out.printf("You have choosen paper\n");
            System.out.printf("computer have choosen rock\n");
        }
        else if (com==2 && you==1){
            System.out.println("You have Won the match!!..");
            System.out.printf("You have choosen rock\n");
            System.out.printf("computer have choosen scissor \n");
        }
        else if (com==2 && you==3){
            System.out.println("You have Lost the match!!..");
            System.out.printf("You have choosen paper\n");
            System.out.printf("computer have choosen scissor \n");
        }
        else if (com==3 && you==1){
            System.out.println("You have Lost the match!!..");
            System.out.printf("You have choosen rock\n");
            System.out.printf("computer have choosen paper\n");
        }
        else if (com==3 && you==2){
            System.out.println("You have Won the match!!..");
            System.out.printf("You have choosen scissor\n");
            System.out.printf("computer have choosen paper\n");
        }
        else{
            System.out.println("You have entered the wrong input please try again.... ");
        }
        sc.close();

    }
}
// We can also reduce the code by the help of arithematical logics like || and &&.....
// All computer won in one else if statement  and all your winning chance is in  either in one elseif or only else("You won!!") statement...
