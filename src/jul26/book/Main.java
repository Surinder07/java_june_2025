package jul26.book;

public class Main {
    public static void main(String[] args) {

        Fiction fiction = new Fiction();
        fiction.author = "JK Rawling";
        fiction.price = 200.23;
        fiction.title ="Harry Potter";

        fiction.bookDetails();
        System.out.println("**************");
        fiction.seriesNumber = 100001;
        fiction.bookDetails();

    }
}
