
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import site.luoyu.dao.Books;
import site.luoyu.dao.BooksRepository;
import site.luoyu.model.User;

import java.sql.Date;


/**
 * Created by xd on 2016/9/17.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
//@ContextConfiguration("classpath:")
public class testJPA {

    private static final Logger log = LogManager.getLogger(testJPA.class);

    @Autowired
    private BooksRepository booksRepository;

    @Autowired
    User user;

    @Test
    public void testBooks(){
        user.setName("rightConfig");
        log.info(user.getName());
        Books aBook = new Books();
        aBook.setIsbn("isbn:123");
        aBook.setLevel(10);
        aBook.setName("C++ Primier");
        Date date = new Date(System.currentTimeMillis());
        log.info(date);
        aBook.setPublishDate(date);
        aBook.setRecommendStar(5);
        aBook.setTypeCodeBooks("计算机");
        aBook.setTypeCodeClass("031114班");
        aBook.setUserId(1);
        booksRepository.save(aBook);
        log.info(booksRepository.findAll());
    }
}
