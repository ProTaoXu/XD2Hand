package site.luoyu.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.luoyu.dao.Books;
import site.luoyu.dao.BooksRepository;
import site.luoyu.model.Book;
import site.luoyu.model.User;

import java.sql.Date;


/**
 * Created by xd on 2016/9/24.
 */
@Service
public class BooksService {

    //日志
    private static final Logger log = LogManager.getLogger(BooksService.class);

    @Autowired
    BooksRepository booksRepository;

    //分页列出书籍
    public void getBooksByPage(){}
    //按照价格来排序
    public void listByPrice(){}
    //书籍推荐
    public void recommendBooks(){}
    //通过星级来排序
    public void listByStar(){}

    /**
     * 二手图书发布
     * @param book
     *     想要发布的图书
     * @param user
     *     发布图书人的信息
     */
    public void publishBook(Book book,User user){
        log.info("图书发布持久化 书名: "+book.getName());
        Books aBook = new Books();
        aBook.setLevel(book.getLevel());
        aBook.setName(book.getName());
        aBook.setPrice(book.getPrice());
        aBook.setStuId(user.getStuId());
        aBook.setPublishDate(new Date(System.currentTimeMillis()));
        booksRepository.save(aBook);
    }
}
