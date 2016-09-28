package site.luoyu.dao;

import javax.persistence.*;

/**
 * Created by xd on 2016/9/26.
 */
@Entity
@Table(name = "order_detail", schema = "", catalog = "bookstore")
public class OrderDetail {
    private String orderDetailId;
    private String orderId;
    private int bookId;

    @Id
    @Column(name = "OrderDetailID")
    public String getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    @Basic
    @Column(name = "OrderID")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "Book_ID")
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderDetail that = (OrderDetail) o;

        if (bookId != that.bookId) return false;
        if (orderDetailId != null ? !orderDetailId.equals(that.orderDetailId) : that.orderDetailId != null)
            return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderDetailId != null ? orderDetailId.hashCode() : 0;
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + bookId;
        return result;
    }
}
