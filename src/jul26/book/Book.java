package jul26.book;

public class Book {
    String author;
    double price;
    String title;

    Book(){

    }

    public Book(String author, double price, String title) {
        this.author = author;
        this.price = price;
        this.title = title;
    }

    public void bookDetails(){
        System.out.println(author);
        System.out.println(price);
        System.out.println(title);
    }
}


/*
Author, price, title, productionCompany
               Book
                |
              Novel  [variable ]
              |   |
        Fiction   Non Fiction

// method - bookDetails()
// create object of Fiction
// create object of NonFiction
 */