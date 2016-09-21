package site.luoyu.service;

import org.springframework.stereotype.Service;
import site.luoyu.model.User;

/**
 * Created by xd on 2016/9/19.
 * 目前对service的理解是，仅仅是一种特殊的bean
 * 通过@service方式来注解，通过@autowired来使用
 * 其余的没有区别，这里需要再确定
 */
//todo 这里的user都依赖于model中的user 而不直接依赖于dao中的内容。这样做的目的是为了当数据库改变的时候前段代码不需要改变
//    每次都会遇到这个问题，直接封装好的entity 不能直接放到前台。但是又不知道怎么封装，这是一个临时办法。
@Service
public class UserService {
    /**
     * 用户登录
     * @param userName
     *      用户姓名
     * @param passwd
     *      用户的密码
     */
    public void login(String userName,String passwd){
    }

    /**
     * 用户注册服务
     * @param user
     *      学生
     * 注册服务
     */
    public void register(User user){
    }

    /**
     * 用户信息保存接口，用户保存信息，更改信息都通过这里来保存。
     * @param user
     *      学生
     * 注册服务
     */
    public void updateInfo(User user){
    }
}
