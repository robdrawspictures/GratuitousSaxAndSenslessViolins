package stock_management.equipment;

public class Book extends Equipment {

    private int pageCount;
    private BookType type;

    public Book(String description, int cost, int pageCount, BookType type) {
        super(description, cost);
        this.pageCount = pageCount;
        this.type = type;
    }

}
