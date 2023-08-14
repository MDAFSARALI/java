import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
class Library{
    int i=0;
    int n;
    Scanner sc=new Scanner(System.in);
    ArrayList<String> books=new ArrayList<>(); 
    void no_of_books(){
        System.out.println("Enter the no of books you want to add: ");
        n=sc.nextInt();
    }
    void book_add(){
        no_of_books();
        System.out.println("Bookname please!!!");
        while (i<=n) {
            String name_of_book=sc.nextLine();
            books.add(name_of_book);
            i++;
        }
    }
    void available_books(){
        for (String book_name : books) {
            System.out.println(book_name);
        }
    }
    void date_of_Issue(){
        LocalDateTime dti=LocalDateTime.now();
        System.out.println("The issue date is : "+dti);
    }
    void returnBook(String bookname){
        book_add();
        System.out.println("Thanks for returning the books of "+bookname);
    }
    void date_of_return(){
        LocalDateTime dtr=LocalDateTime.now();
        System.out.println("The return date is :" +dtr);
        System.out.println("Thanks for returning the books....");
        System.out.println("Have a greet day!!!");
    }   
}

public class CWH_lect_102_Exercise_07 {
    String Bookname;
    String Book_Author;
    
    public static void main(String[] args) {
       
        
            //We have to create a library management System..
            /*
             * Create a library management system which is capable of issueing books to the students.
             * Book should have info linke:
             * Book name 
             * Book Author
             * Issued to
             * Issued on
             * User should be able to add books and return issued books,Issue book
             * Assume that all the users are registered with their names in central data base...
             */
            Library l=new Library();
            l.no_of_books();
            l.book_add();
            l.available_books();
            l.date_of_Issue();
            l.returnBook("c");
            l.date_of_return();

    }
}
