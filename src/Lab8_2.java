class Book3 {
    String title;
    String author;
    double price;

    Book3(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displaydetails() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }
}

class Ebook extends Book3 {
    double filesize;

    Ebook(String title, String author, double price, double filesize) {
        super(title, author, price);
        this.filesize = filesize;
    }

    @Override
    void displaydetails() {
        super.displaydetails();
        System.out.println(filesize);
    }
}

public class Lab8_2 {
    public static void main(String[] args) {
        Book3 cprogram = new Book3("C program", "GHANNATH", 80000);
        Ebook digitalbook = new Ebook("dgital c book", "prabhat", 9.99, 2.5);
        cprogram.displaydetails();
        digitalbook.displaydetails();
    }
}
