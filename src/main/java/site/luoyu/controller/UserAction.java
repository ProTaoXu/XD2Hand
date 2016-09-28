package site.luoyu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import site.luoyu.model.Book;
import site.luoyu.model.User;
import site.luoyu.service.BooksService;

import javax.servlet.http.HttpSession;

/**
 * 这个用来实现用户的行为，例如发布图书，浏览图书。查看图书详情等。
 * Created by xd on 2016/9/14.
 */
@Controller
@RequestMapping("/userAction")
public class UserAction {

    private static final org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(UserAction.class);

    @Autowired
    private BooksService booksService;

    /**
     * 发布用户图书
     */
    //todo 这里细作的话需要支持多本书同时发布，我现在只是发不完一本后跳转到发布页面，这样不太好
    //todo 临时不支持图片上传功能
    @RequestMapping("/publishBook")
    public void publishBookSale(@Validated Book book ,HttpSession session){
        log.info("发布图书销售信息 图书名称: "+ book.getName());
        User user = (User) session.getAttribute("user");
        booksService.publishBook(book,user);
    }

    /**
     * 浏览主页面
     */
    @RequestMapping("/MainPage")
    public void browseMainPage(){
        System.out.println("用户浏览主页面，这里需要books表的持久化，将books表中的内容全都列出来");
        System.out.println("图书清单的策略");
    }

    /**
     * 搜索图书
     * 这里是一个难点，如何分词等问题都值得思考
     */
    @RequestMapping("/searchBooks")
    public void searchBooks(){}
}
