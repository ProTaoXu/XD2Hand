package site.luoyu.dao;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by xd on 2016/11/1.
 */
@Entity
@Table(name = "book_comment", schema = "", catalog = "bookstore")
public class BookComment {
    private int cId;
    private Integer stuId;
    private Long isbn;
    private String content;
    private Timestamp commentdate;

    @Id
    @Column(name = "C_id")
    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    @Basic
    @Column(name = "Stu_id")
    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    @Basic
    @Column(name = "isbn")
    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "Commentdate")
    public Timestamp getCommentdate() {
        return commentdate;
    }

    public void setCommentdate(Timestamp commentdate) {
        this.commentdate = commentdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookComment that = (BookComment) o;

        if (cId != that.cId) return false;
        if (commentdate != null ? !commentdate.equals(that.commentdate) : that.commentdate != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (isbn != null ? !isbn.equals(that.isbn) : that.isbn != null) return false;
        if (stuId != null ? !stuId.equals(that.stuId) : that.stuId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cId;
        result = 31 * result + (stuId != null ? stuId.hashCode() : 0);
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (commentdate != null ? commentdate.hashCode() : 0);
        return result;
    }
}
