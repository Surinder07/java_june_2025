package jul26.book;

public class Fiction extends Novel{
    @Override
    public void bookDetails() {
        super.bookDetails();
        System.out.println(seriesNumber);
    }

    double seriesNumber;

}
