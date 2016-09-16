package site.luoyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 这个用来实现用户的行为，例如发布图书，浏览图书。查看图书详情等。
 * Created by xd on 2016/9/14.
 */
@Controller
@RequestMapping("/userAction")
public class UserAction {

    /**
     * 发布用户图书
     */
    @RequestMapping("/publishBook")
    public void publishBookSale(){
        System.out.print("发布图书销售信息：这里需要组合books表的持久化");
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
