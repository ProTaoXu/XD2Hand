package site.luoyu.dao;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by xd on 2016/11/1.
 */
@Entity
public class Community {
    private int communityId;
    private String name;
    private String address;
    private Byte type;

    @Id
    @Column(name = "Community_id")
    public int getCommunityId() {
        return communityId;
    }

    public void setCommunityId(int communityId) {
        this.communityId = communityId;
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
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "type")
    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Community community = (Community) o;

        if (communityId != community.communityId) return false;
        if (address != null ? !address.equals(community.address) : community.address != null) return false;
        if (name != null ? !name.equals(community.name) : community.name != null) return false;
        if (type != null ? !type.equals(community.type) : community.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = communityId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
