package pers.zhangdi.vo;

public class Book {
    private String book_name;
    private String book_author;
    private String book_press;
    private String book_year;
    private String book_id;
    private int book_num;
    private int book_borrowed;
    private String book_record;

    public Book(String book_name, String book_author, String book_press, String book_year, String book_id, int book_num, int book_borrowed, String book_record) {
        this.book_name = book_name;
        this.book_author = book_author;
        this.book_press = book_press;
        this.book_year = book_year;
        this.book_id = book_id;
        this.book_num = book_num;
        this.book_borrowed = book_borrowed;
        this.book_record = book_record;
    }

    public Book() {
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public String getBook_press() {
        return book_press;
    }

    public void setBook_press(String book_press) {
        this.book_press = book_press;
    }

    public String getBook_year() {
        return book_year;
    }

    public void setBook_year(String book_year) {
        this.book_year = book_year;
    }

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public int getBook_num() {
        return book_num;
    }

    public void setBook_num(int book_num) {
        this.book_num = book_num;
    }

    public int getBook_borrowed() {
        return book_borrowed;
    }

    public void setBook_borrowed(int book_borrowed) {
        this.book_borrowed = book_borrowed;
    }

    public String getBook_record() {
        return book_record;
    }

    public void setBook_record(String book_record) {
        this.book_record = book_record;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_name='" + book_name + '\'' +
                ", book_author='" + book_author + '\'' +
                ", book_press='" + book_press + '\'' +
                ", book_year='" + book_year + '\'' +
                ", book_id='" + book_id + '\'' +
                ", book_num=" + book_num +
                ", book_borrowed=" + book_borrowed +
                ", book_record='" + book_record + '\'' +
                '}';
    }
}
