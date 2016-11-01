package site.luoyu.dao;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by xd on 2016/11/1.
 */
@Entity
@Table(name = "book_isbn", schema = "", catalog = "bookstore")
public class BookIsbn {
    private long isbnId;
    private String isbn10;
    private String isbn13;
    private String title;
    private String image;
    private String author;
    private String translator;
    private String publisher;
    private Date pubdate;
    private String binding;
    private Float price;
    private Short pages;
    private String authorIntro;
    private String summary;
    private String catalog;

    @Id
    @Column(name = "ISBN_id")
    public long getIsbnId() {
        return isbnId;
    }

    public void setIsbnId(long isbnId) {
        this.isbnId = isbnId;
    }

    @Basic
    @Column(name = "isbn10")
    public String getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }

    @Basic
    @Column(name = "isbn13")
    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Basic
    @Column(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "translator")
    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    @Basic
    @Column(name = "publisher")
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Basic
    @Column(name = "pubdate")
    public Date getPubdate() {
        return pubdate;
    }

    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }

    @Basic
    @Column(name = "binding")
    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
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
    @Column(name = "pages")
    public Short getPages() {
        return pages;
    }

    public void setPages(Short pages) {
        this.pages = pages;
    }

    @Basic
    @Column(name = "author_intro")
    public String getAuthorIntro() {
        return authorIntro;
    }

    public void setAuthorIntro(String authorIntro) {
        this.authorIntro = authorIntro;
    }

    @Basic
    @Column(name = "summary")
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Basic
    @Column(name = "catalog")
    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookIsbn bookIsbn = (BookIsbn) o;

        if (isbnId != bookIsbn.isbnId) return false;
        if (author != null ? !author.equals(bookIsbn.author) : bookIsbn.author != null) return false;
        if (authorIntro != null ? !authorIntro.equals(bookIsbn.authorIntro) : bookIsbn.authorIntro != null)
            return false;
        if (binding != null ? !binding.equals(bookIsbn.binding) : bookIsbn.binding != null) return false;
        if (catalog != null ? !catalog.equals(bookIsbn.catalog) : bookIsbn.catalog != null) return false;
        if (image != null ? !image.equals(bookIsbn.image) : bookIsbn.image != null) return false;
        if (isbn10 != null ? !isbn10.equals(bookIsbn.isbn10) : bookIsbn.isbn10 != null) return false;
        if (isbn13 != null ? !isbn13.equals(bookIsbn.isbn13) : bookIsbn.isbn13 != null) return false;
        if (pages != null ? !pages.equals(bookIsbn.pages) : bookIsbn.pages != null) return false;
        if (price != null ? !price.equals(bookIsbn.price) : bookIsbn.price != null) return false;
        if (pubdate != null ? !pubdate.equals(bookIsbn.pubdate) : bookIsbn.pubdate != null) return false;
        if (publisher != null ? !publisher.equals(bookIsbn.publisher) : bookIsbn.publisher != null) return false;
        if (summary != null ? !summary.equals(bookIsbn.summary) : bookIsbn.summary != null) return false;
        if (title != null ? !title.equals(bookIsbn.title) : bookIsbn.title != null) return false;
        if (translator != null ? !translator.equals(bookIsbn.translator) : bookIsbn.translator != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (isbnId ^ (isbnId >>> 32));
        result = 31 * result + (isbn10 != null ? isbn10.hashCode() : 0);
        result = 31 * result + (isbn13 != null ? isbn13.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (translator != null ? translator.hashCode() : 0);
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        result = 31 * result + (pubdate != null ? pubdate.hashCode() : 0);
        result = 31 * result + (binding != null ? binding.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (pages != null ? pages.hashCode() : 0);
        result = 31 * result + (authorIntro != null ? authorIntro.hashCode() : 0);
        result = 31 * result + (summary != null ? summary.hashCode() : 0);
        result = 31 * result + (catalog != null ? catalog.hashCode() : 0);
        return result;
    }
}
