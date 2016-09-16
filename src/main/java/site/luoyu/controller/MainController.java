package site.luoyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import site.luoyu.model.User;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by xd on 2016/9/16.
 */
@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping()
    public String homeRedirect(HttpServletResponse response,Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "login";
    }
}
