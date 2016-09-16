package site.luoyu.model;

import org.springframework.stereotype.Component;

/**
 * 这里定义的是和用户相关的信息。
 * 底层直接调用dao中的内容进行持久化
 * Created by xd on 2016/9/14.
 */
@Component
public class User {
    private String name;
    private String passwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
