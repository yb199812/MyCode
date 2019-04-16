package cn.yxin.domain;

import java.sql.Timestamp;
import java.io.Serializable;

/**
 *用户
 */
public class User implements Serializable{
    String id;
    String passworld;
    String name;
    String phone;
    String home;
    Timestamp creattime;

    public String getPassworld() {
        return passworld;
    }

    public void setPassworld(String passworld) {
        this.passworld = passworld;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public Timestamp getCreattime() {
        return creattime;
    }

    public void setCreattime(Timestamp creattime) {
        this.creattime = creattime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", passworld='" + passworld + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", home='" + home + '\'' +
                ", creattime=" + creattime +
                '}';
    }
}
