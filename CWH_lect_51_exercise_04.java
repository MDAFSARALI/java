class Library{
    String [] books;
    int no_of_books;
    Library(){
        this.books=new String[100];
        no_of_books=0;
    }
    void addBook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+" has been added successfully");
    }
    void showAvailableBooks(){
        System.out.println("Available books are: ");
        for (String book : books) {
            if (book==null) { 
                continue; 
            }
            System.out.println("* "+book); 
        }
          
        }
    
    void issueBook(String book){
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)) {
                System.out.println("The book has been issued...");
                this.books[i]=null;
                return;
            }
           
            
        }
            System.out.println("The book does not exist...");
    }
    void returnBook(String book){
        // this.books[no_of_books]=book;
        addBook(book);
    }
}



public class CWH_lect_51_exercise_04 {
    public static void main(String[] args) {
        //You have to implement a library using java class library
        // methods:addaBook,issueBook,returnBook,showAvailableBooks,
        // properties:array to store the available book
        // array to store the issuedbook
        // 
        // The solution of this is available in library.java
        Library centralLiberaray=new Library();
        centralLiberaray.addBook("Happy man");
        centralLiberaray.addBook("java");
        centralLiberaray.addBook("C++");
        centralLiberaray.showAvailableBooks();
        centralLiberaray.issueBook("java");
        centralLiberaray.showAvailableBooks();
        centralLiberaray.returnBook("Afsar");
        centralLiberaray.showAvailableBooks();
        centralLiberaray.returnBook("java");
        centralLiberaray.showAvailableBooks();

    }
}
