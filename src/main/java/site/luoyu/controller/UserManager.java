package site.luoyu.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import site.luoyu.dao.Books;
import site.luoyu.dao.BooksRepository;
import site.luoyu.model.User;
import site.luoyu.service.UserService;

import java.sql.Date;
import java.util.Iterator;

/**
 * Created by 张洋 on 2016/9/14.
 * 用户管理控制器
 */

@Controller
@RequestMapping(value = "/userManage")
public class UserManager {

    private static final Logger log = LogManager.getLogger(UserManager.class);

    @Autowired
    private BooksRepository booksRepository;

    @Autowired
    private UserService userService;

    /**
     * 注册 返回注册页面
     */
    @RequestMapping("/register")
    public String register(Model model){
        User userRegister = new User();
        model.addAttribute("user",userRegister);
        return "register";
    }

    /**
     * 登陆
     */
    @RequestMapping("/login")
    public String login(@Validated User user){

        Books aBook = new Books();
        aBook.setIsbn("isbn:123");
        aBook.setLevel(10);
        aBook.setName("C++ Primier");
        Date date = new Date(System.currentTimeMillis());
        aBook.setPublishDate(date);
        aBook.setRecommendStar(5);
        aBook.setTypeCodeBooks("计算机");
        aBook.setTypeCodeClass("031114班");
        aBook.setUserId(1);
        booksRepository.save(aBook);
        Iterable<Books> booksList = booksRepository.findAll();
        for (Iterator it = booksList.iterator();it.hasNext();){
            Books singleBook = (Books) it.next();
            log.info(singleBook.getTypeCodeBooks());
        }
        System.out.println("用户登陆密码判断");


        if(user.getPasswd().equals("admin")){
            return "MainPage";
        }else {
            return "redirect:/";
        }
    }

    /**
     * 编辑个人信息
     */
    @RequestMapping("/editInfo")
    public void editInfo(){}
}
