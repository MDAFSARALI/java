// We must have to write the information and description before and up of that class for which we wan't to write...We can write it above the package ...
/*DESCRIPTION :Is tarah hm log java docs me discription likh sakte hai...This is the discription
 * @author Afsar(Akbar)
 * @version 0.1
 * @since 2002
 * @see java Docs
 */
public class CWH_lect_103_Generation_of_own_Docs_for_our_package {
    public void add(int a ,int b){
        System.out.println("The sum is :"+(a+b));
    }
    public static void main(String[] args) {
    // go to TOOLS--->Generate java Docs option
    // Tags for class or a package:
    System.out.println("This is my main method: ");
    
// Tags for methods: 
/** slash double star is the comment for java docs and if we use slash star then that will be normal comment... */
/**
 * Description: This is the discription of the methods of this class...
 * @param i This is the an integer arguments of first...
 * @param j This is the an integer arguments of second...
 * @return Sum of two numbers as an integer...
 * @throws exception if i is zero...
 * @depricated This method is depricated please use plus opertor
  */
//     public int add(int i,int j){
//         int c=i+j;
//         return c

// }



    }
}
