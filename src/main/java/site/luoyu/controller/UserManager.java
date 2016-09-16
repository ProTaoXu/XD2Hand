package site.luoyu.controller;

import com.sun.javafx.sg.prism.NGShape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import site.luoyu.model.User;

/**
 * Created by 张洋 on 2016/9/14.
 * 用户管理控制器
 */

@Controller
@RequestMapping(value = "/userManage")
public class UserManager {

    private User user = null;
    @Autowired
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * 注册
     */
    @RequestMapping("/register")
    public void register(){}

    /**
     * 登陆
     */
    @RequestMapping("/login")
    public String login(@Validated User user){
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
