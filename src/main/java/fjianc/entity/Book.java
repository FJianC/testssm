package fjianc.entity;

public class Book {
    private long bookId;// 图书ID

    private String name;// 图书名称

    private int number;// 馆藏数量

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public long getBookId() {
        return bookId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Book[bookId=" + bookId + ", name=" + name +
                ", number=" + number + "]";
    }
}
