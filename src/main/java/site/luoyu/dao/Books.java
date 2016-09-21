package site.luoyu.dao;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by xd on 2016/9/20.
 */
@Entity
public class Books {
    private int id;
    private Integer userId;
    private String name;
    private String isbn;
    private String pictures;
    private Integer level;
    private Integer recommendStar;
    private Date publishDate;
    private String typeCodeBooks;
    private String typeCodeClass;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "isbn")
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Basic
    @Column(name = "pictures")
    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    @Basic
    @Column(name = "level")
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Basic
    @Column(name = "recommendStar")
    public Integer getRecommendStar() {
        return recommendStar;
    }

    public void setRecommendStar(Integer recommendStar) {
        this.recommendStar = recommendStar;
    }

    @Basic
    @Column(name = "publish_date")
    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    @Basic
    @Column(name = "typeCode_books")
    public String getTypeCodeBooks() {
        return typeCodeBooks;
    }

    public void setTypeCodeBooks(String typeCodeBooks) {
        this.typeCodeBooks = typeCodeBooks;
    }

    @Basic
    @Column(name = "typeCode_class")
    public String getTypeCodeClass() {
        return typeCodeClass;
    }

    public void setTypeCodeClass(String typeCodeClass) {
        this.typeCodeClass = typeCodeClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Books books = (Books) o;

        if (id != books.id) return false;
        if (isbn != null ? !isbn.equals(books.isbn) : books.isbn != null) return false;
        if (level != null ? !level.equals(books.level) : books.level != null) return false;
        if (name != null ? !name.equals(books.name) : books.name != null) return false;
        if (pictures != null ? !pictures.equals(books.pictures) : books.pictures != null) return false;
        if (publishDate != null ? !publishDate.equals(books.publishDate) : books.publishDate != null) return false;
        if (recommendStar != null ? !recommendStar.equals(books.recommendStar) : books.recommendStar != null)
            return false;
        if (typeCodeBooks != null ? !typeCodeBooks.equals(books.typeCodeBooks) : books.typeCodeBooks != null)
            return false;
        if (typeCodeClass != null ? !typeCodeClass.equals(books.typeCodeClass) : books.typeCodeClass != null)
            return false;
        if (userId != null ? !userId.equals(books.userId) : books.userId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        result = 31 * result + (pictures != null ? pictures.hashCode() : 0);
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + (recommendStar != null ? recommendStar.hashCode() : 0);
        result = 31 * result + (publishDate != null ? publishDate.hashCode() : 0);
        result = 31 * result + (typeCodeBooks != null ? typeCodeBooks.hashCode() : 0);
        result = 31 * result + (typeCodeClass != null ? typeCodeClass.hashCode() : 0);
        return result;
    }
}
