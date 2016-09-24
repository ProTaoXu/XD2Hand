package site.luoyu.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import site.luoyu.model.User;
import site.luoyu.service.UserService;

/**
 * Created by 张洋 on 2016/9/14.
 * 用户管理控制器
 */

@Controller
@RequestMapping(value = "/userManage")
public class UserManager {

    private static final Logger log = LogManager.getLogger(UserManager.class);

//    @Autowired
//    private BooksRepository booksRepository;

    @Autowired
    private UserService userService;

    /**
     * 注册 返回注册页面
     */
    @RequestMapping("/registerPage")
    public String getRegisterPage(Model model){
        User userRegister = new User();
        model.addAttribute("user",userRegister);
        return "register";
    }

    /**
     * 用户填好信息后将信息回传保存
     * @param user
     *      用户的信息
     * @return
     *      返回注册成功的页面
     */
    @RequestMapping("/register")
    public String register(@Validated User user,Model model){
        model.addAttribute("user",user);
        if(userService.register(user))return "MainPage";
        else return "login";
    }

    /**
     * 登陆
     */
    @RequestMapping("/login")
    public String login(@Validated User user,Model model){

        if(user.getPasswd().equals("admin") || userService.login(user)){
            model.addAttribute("user",user);
            return "MainPage";
        }else {
            return "redirect:/";
        }
    }

    /**
     * 编辑个人信息
     */
    @RequestMapping("/editInfo")
    public void editInfo(@Validated User user){
    }
}
