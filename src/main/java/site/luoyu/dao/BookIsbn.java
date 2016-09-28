package site.luoyu.dao;

import javax.persistence.*;

/**
 * Created by xd on 2016/9/26.
 */
@Entity
@Table(name = "book_isbn", schema = "", catalog = "bookstore")
public class BookIsbn {
    private String isbn;
    private String bookName;

    @Id
    @Column(name = "isbn")
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Basic
    @Column(name = "Book_name")
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookIsbn bookIsbn = (BookIsbn) o;

        if (bookName != null ? !bookName.equals(bookIsbn.bookName) : bookIsbn.bookName != null) return false;
        if (isbn != null ? !isbn.equals(bookIsbn.isbn) : bookIsbn.isbn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = isbn != null ? isbn.hashCode() : 0;
        result = 31 * result + (bookName != null ? bookName.hashCode() : 0);
        return result;
    }
}
