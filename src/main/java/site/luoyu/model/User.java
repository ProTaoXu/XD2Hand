package site.luoyu.model;

import org.springframework.stereotype.Component;

/**
 * 这里定义的是和用户相关的信息。
 * 底层直接调用dao中的内容进行持久化
 * Created by xd on 2016/9/14.
 */
@Component
public class User {

    private int stuId;
    private String name;
    private String nickname;
    private String phoneNumber;
    private String email;
    private String classes;
    private byte[] portrait;
    private String passwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public byte[] getPortrait() {
        return portrait;
    }

    public void setPortrait(byte[] portrait) {
        this.portrait = portrait;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }
}
