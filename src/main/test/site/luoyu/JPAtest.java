package site.luoyu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import site.luoyu.dao.Books;
import site.luoyu.dao.Repository.BooksRepository;
import site.luoyu.model.User;

import java.sql.Date;
import java.util.Iterator;


/**
 * Created by xd on 2016/9/17.
 */
public class JPAtest extends SpringContext {

    private static final Logger log = LogManager.getLogger(JPAtest.class);

    @Autowired
    private BooksRepository booksRepository;

    @Autowired
    User user;

    @Test
    @Transactional
    public void testBooks(){
        user.setName("rightConfig");
        log.info(user.getName());
        Books aBook = new Books();
        aBook.setLevel(10);
        aBook.setName("C++ Primier");
        Date date = new Date(System.currentTimeMillis());
        log.info(date);
        aBook.setPublishDate(date);
        aBook.setRecommendStar(5);
        aBook.setTypeCodeClass("031114班");
        booksRepository.save(aBook);
        Iterable<Books> BookList = booksRepository.findAll();
        Iterator<Books> iterator = BookList.iterator();
        while (iterator.hasNext()){
            Books doneBook = iterator.next();
            log.info("已发布图书名称："+doneBook.getName());
        }
    }
}
