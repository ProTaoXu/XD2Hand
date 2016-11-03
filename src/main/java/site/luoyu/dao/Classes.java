package site.luoyu.dao;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by xd on 2016/11/1.
 */
@Entity
public class Classes {
    private int classId;
    private String name;
    private Integer communityId;

    @Id
    @Column(name = "Class_id")
    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
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
    @Column(name = "Community_id")
    public Integer getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Classes classes = (Classes) o;

        if (classId != classes.classId) return false;
        if (communityId != null ? !communityId.equals(classes.communityId) : classes.communityId != null) return false;
        if (name != null ? !name.equals(classes.name) : classes.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = classId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (communityId != null ? communityId.hashCode() : 0);
        return result;
    }
}
