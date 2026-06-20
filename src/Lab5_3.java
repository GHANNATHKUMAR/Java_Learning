
import java.util.*;

class Book {
    int bookId;
    String title;
    String author;
    boolean isIssued;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    void display() {
        System.out.println(bookId + " - " + title + " by " + author + " [" + (isIssued ? "Issued" : "Available") + "]");
    }
}

class Library {
    Book[] books;
    int count;

    Library(int size) {
        books = new Book[size];
        count = 0;
    }

    void addBook(Book b) {
        if (count < books.length) {
            books[count] = b;
            count++;
            System.out.println("Book added: " + b.title);
        } else {
            System.out.println("Library is full, cannot add more books");
        }
    }

    void issueBook(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].bookId == id && !books[i].isIssued) {
                books[i].isIssued = true;
                System.out.println("Book issued: " + books[i].title);
                return;
            }
        }
        System.out.println("Book not available or already issued");
    }

    void returnBook(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].bookId == id && books[i].isIssued) {
                books[i].isIssued = false;
                System.out.println("Book returned: " + books[i].title);
                return;
            }
        }
        System.out.println("Invalid return, book not found or not issued");
    }

    void displayBooks() {
        System.out.println("----- Library Books -----");
        for (int i = 0; i < count; i++) {
            books[i].display();
        }
    }
}

public class Lab5_3 {
    public static void main(String[] args) {
        Library lib = new Library(5);
        // adding books
        lib.addBook(new Book(1, "Java Basics", "James"));
        lib.addBook(new Book(2, "C Programming", "Dennis"));
        lib.addBook(new Book(3, "Python Intro", "Guido"));
        // display
        lib.displayBooks();
        // issue a book
        lib.issueBook(2);
        // try issuing same book again
        lib.issueBook(2);
        // return book
        lib.returnBook(2);
        // final display
        lib.displayBooks();
    }
}
