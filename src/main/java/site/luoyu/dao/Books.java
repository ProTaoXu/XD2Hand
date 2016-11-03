package site.luoyu.dao;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by xd on 2016/11/1.
 */
@Entity
public class Books {
    private int bookId;
    private Integer stuId;
    private Long isbn;
    private String pictures;
    private Integer level;
    private Integer recommendStar;
    private Date publishDate;
    private Integer bookTypeId;
    private String typeCodeClass;
    private Float price;
    private String name;

    @Id
    @Column(name = "Book_id")
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
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
    @Column(name = "BookTypeId")
    public Integer getBookTypeId() {
        return bookTypeId;
    }

    public void setBookTypeId(Integer bookTypeId) {
        this.bookTypeId = bookTypeId;
    }

    @Basic
    @Column(name = "typeCode_class")
    public String getTypeCodeClass() {
        return typeCodeClass;
    }

    public void setTypeCodeClass(String typeCodeClass) {
        this.typeCodeClass = typeCodeClass;
    }

    @Basic
    @Column(name = "price")
    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Books books = (Books) o;

        if (bookId != books.bookId) return false;
        if (bookTypeId != null ? !bookTypeId.equals(books.bookTypeId) : books.bookTypeId != null) return false;
        if (isbn != null ? !isbn.equals(books.isbn) : books.isbn != null) return false;
        if (level != null ? !level.equals(books.level) : books.level != null) return false;
        if (name != null ? !name.equals(books.name) : books.name != null) return false;
        if (pictures != null ? !pictures.equals(books.pictures) : books.pictures != null) return false;
        if (price != null ? !price.equals(books.price) : books.price != null) return false;
        if (publishDate != null ? !publishDate.equals(books.publishDate) : books.publishDate != null) return false;
        if (recommendStar != null ? !recommendStar.equals(books.recommendStar) : books.recommendStar != null)
            return false;
        if (stuId != null ? !stuId.equals(books.stuId) : books.stuId != null) return false;
        if (typeCodeClass != null ? !typeCodeClass.equals(books.typeCodeClass) : books.typeCodeClass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bookId;
        result = 31 * result + (stuId != null ? stuId.hashCode() : 0);
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        result = 31 * result + (pictures != null ? pictures.hashCode() : 0);
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + (recommendStar != null ? recommendStar.hashCode() : 0);
        result = 31 * result + (publishDate != null ? publishDate.hashCode() : 0);
        result = 31 * result + (bookTypeId != null ? bookTypeId.hashCode() : 0);
        result = 31 * result + (typeCodeClass != null ? typeCodeClass.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
