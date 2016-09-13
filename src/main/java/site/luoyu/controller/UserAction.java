package site.luoyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 这个用来实现用户的额行为，不如发布图书，浏览图书。查看图书详情等。
 * 这个用来实现用户的额行为，不如发布图书，浏览图书。查看图书详情等。
 * Created by xd on 2016/9/14.
 */
@Controller
@RequestMapping("/userAction")
public class UserAction {

    /**
     * 发布用户图书
     */
    @RequestMapping("/publishBook")
    public void publishBookSale(){}

    /**
     * 浏览主页面
     */
    @RequestMapping("/MainPage")
    public void browseMainPage(){}

    /**
     * 搜索图书
     * 这里是一个难点，如何分词等问题都值得思考
     */
    @RequestMapping("/searchBooks")
    public void searchBooks(){}
}
