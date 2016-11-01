package site.luoyu.dao;

import javax.persistence.*;

/**
 * Created by xd on 2016/11/1.
 */
@Entity
@Table(name = "book_typeinfo", schema = "", catalog = "bookstore")
public class BookTypeinfo {
    private int bookTypeId;
    private String bookTypeName;

    @Id
    @Column(name = "BookTypeId")
    public int getBookTypeId() {
        return bookTypeId;
    }

    public void setBookTypeId(int bookTypeId) {
        this.bookTypeId = bookTypeId;
    }

    @Basic
    @Column(name = "BookTypeName")
    public String getBookTypeName() {
        return bookTypeName;
    }

    public void setBookTypeName(String bookTypeName) {
        this.bookTypeName = bookTypeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookTypeinfo that = (BookTypeinfo) o;

        if (bookTypeId != that.bookTypeId) return false;
        if (bookTypeName != null ? !bookTypeName.equals(that.bookTypeName) : that.bookTypeName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bookTypeId;
        result = 31 * result + (bookTypeName != null ? bookTypeName.hashCode() : 0);
        return result;
    }
}
