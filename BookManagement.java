class Book {
    String title;
    String author;
    boolean isIssued;
    void displayBook() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Issued: " + isIssued);
    }
    void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println(title + " has been issued.");
        } else {
            System.out.println(title + " is already issued.");
        }
    }
    void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not issued.");
        }
    }
}
public class BookManagement {
    public static void main(String[] args){
        Book book1 = new Book();
        book1.title = "Java Programming";
        book1.author = "James Gosling";
        book1.isIssued = false;
        book1.displayBook();
        System.out.println();
        book1.issueBook();
        System.out.println();
        book1.displayBook();
        System.out.println();
        book1.returnBook();
    }
}
