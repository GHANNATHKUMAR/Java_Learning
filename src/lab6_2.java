class book {
    String title;
    String author;
    double price;

    // 1. Default constructor
    book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // 2. Parameterized constructor
    book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // 3. Copy constructor
    book(book b) {
        this.title = b.title;
        this.author = b.author;
        this.price = b.price;
    }

    // Display method
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("-------------------------");
    }
}

public class lab6_2 {
    public static void main(String[] args) {
        // 1. Book using default constructor
        book book1 = new book();
        // 2. Book using parameterized constructor
        book book2 = new book("Java Programming", "James Gosling", 499.99);
        // 3. Book using copy constructor (copy of book2)
        book book3 = new book(book2);
        // Print all details
        System.out.println("Book 1 details:");
        book1.display();

        System.out.println("Book 2 details:");
        book2.display();

        System.out.println("Book 3 details (copy of Book 2):");
        book3.display();
    }
}