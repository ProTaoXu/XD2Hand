package site.luoyu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    public void login(){}

    /**
     * 编辑个人信息
     */
    @RequestMapping("/editInfo")
    public void editInfo(){}
}
