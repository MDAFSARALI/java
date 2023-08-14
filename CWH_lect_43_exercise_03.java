import java.util.Scanner;
import java.util.Random;
class Game{
    public int number;
    public int inputNo;
    public int noOfGuesses=0;
    public int getnoOfGuesses(){
        return noOfGuesses;
    }
    public void setnoOfGuesses(int noOfGuesses){
        this.noOfGuesses=noOfGuesses;
    }
    Game(){
        Random rand=new Random();
        this.number=rand.nextInt(100);//This contain 0 to 100...
        System.out.println(number);
        
    }
    int takeUserInput(){
        
        System.out.println("Guess the number between 1 to 20: ");
        Scanner sc=new Scanner(System.in);
        inputNo=sc.nextInt();
        return inputNo;
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (number==inputNo) {
            System.out.printf("Yes you guessed it right it was %d\n You guessed it in %d attemps ",number,noOfGuesses);
            return true;
        }
        else if (inputNo<number) {
            System.out.println(" computer generated number is greater than entred...");
        }
        else if (inputNo>number) {
            System.out.println(" computer generated number is lower than entred...");
        }
        
        return false;

        
    }
}
public class CWH_lect_43_exercise_03 {
    public static void main(String[] args) {
           /*: Create a class game,which allows to user to play "Guess the number" game once .Game should have the following methods:
        1.Constructor to generate the randome number
        2.takeUserInput() totake a use input of number
        3.isCorrectNumber() to detect wether the number entred by user is true
        4.getter and setter for noOfGuesses
        use properties such as noOfGuesses(int ),etc to get this task done!...
         */
        Game freefire=new Game();
        boolean b=false;
        while (!b) {
            freefire.takeUserInput();
         b=freefire.isCorrectNumber();
        //  System.out.println(b);
    
        }
        

    }
}
