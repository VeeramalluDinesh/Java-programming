class Book {
    String bookTitle;
    String author;
    int bookId;
    
    void displayBook() {
        System.out.println("Book ID    : " + bookId);
        System.out.println("Title      : " + bookTitle);
        System.out.println("Author     : " + author);
    }
}
class Library {
    String libraryName;

    void issueBook(Book b) {
        System.out.println("\nBook Issued Successfully!");
        System.out.println("Issued Book: " + b.bookTitle);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {

        Book book1 = new Book();

        book1.bookId = 101;
        book1.bookTitle = "Java Programming";
        book1.author = "James Gosling";
        
        Library lib = new Library();
        lib.libraryName = "Central Library";
        System.out.println("----- BOOK DETAILS -----");
        book1.displayBook();

        System.out.println("\nLibrary Name: " + lib.libraryName);
        lib.issueBook(book1);
    }
}
