
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import site.luoyu.dao.Books;
import site.luoyu.dao.BooksRepository;
import site.luoyu.model.User;

import java.sql.Date;


/**
 * Created by xd on 2016/9/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
//@ContextConfiguration("classpath:")
public class testJPA {

    private static final Logger log = LogManager.getLogger(testJPA.class);

    //todo 哈哈，一个bug component scan与 repository冲突，会提示无法找到正确的bean，其实都是一个
//    用qualifier 能解决这个问题，但是不知道这么干会不会禁止了jpa的动态代理特性
    @Qualifier("booksRepository")
    @Autowired
    private BooksRepository booksRepository;

    @Autowired
    User user;

    @Test
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
        log.info(booksRepository.findAll());
    }
}
