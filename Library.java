public class Library {
    String []Books={"let us c","Java","Harry notes","Coa","DSA"};
    String []issuedBook={};
    public void showAvailableBooks(){
        for (String item : Books) {
            System.out.println(item);
        }
    }
    void addaBook(String book){
        System.out.println("The has been added...");
        
    }
    void issueBook(String book){
        System.out.println("The book has been issued please take care of it..."+"Book name:"+book);
        
    }
    void returnBook(String book){
        System.out.println("Thanks for returning the book"+"Book name: "+book);
    }

    public static void main(String[] args) {
        Library studentLibrary=new Library();
        studentLibrary.showAvailableBooks();
    }
}
