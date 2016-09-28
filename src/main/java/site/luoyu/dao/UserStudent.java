package site.luoyu.dao;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by xd on 2016/9/26.
 */
@Entity
@Table(name = "user_student", schema = "", catalog = "bookstore")
public class UserStudent {
    private int stuId;
    private String name;
    private String nickname;
    private String phoneNumber;
    private String email;
    private String classes;
    private byte[] portrait;
    private String passwd;

    @Id
    @Column(name = "Stu_id")
    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "nickname")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "classes")
    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Basic
    @Column(name = "portrait")
    public byte[] getPortrait() {
        return portrait;
    }

    public void setPortrait(byte[] portrait) {
        this.portrait = portrait;
    }

    @Basic
    @Column(name = "passwd")
    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserStudent that = (UserStudent) o;

        if (stuId != that.stuId) return false;
        if (classes != null ? !classes.equals(that.classes) : that.classes != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (nickname != null ? !nickname.equals(that.nickname) : that.nickname != null) return false;
        if (passwd != null ? !passwd.equals(that.passwd) : that.passwd != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
        if (!Arrays.equals(portrait, that.portrait)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stuId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (classes != null ? classes.hashCode() : 0);
        result = 31 * result + (portrait != null ? Arrays.hashCode(portrait) : 0);
        result = 31 * result + (passwd != null ? passwd.hashCode() : 0);
        return result;
    }
}
