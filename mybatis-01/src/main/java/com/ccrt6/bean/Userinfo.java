package com.ccrt6.bean;

/**
 * @author zh
 * @Title:Userinfo
 * @Package:com.ccrt6.bean
 * @Description:实体类
 * @date 2022/6/2818:45
 */
public class Userinfo {
    private int id;
    private String name;
    private String ped;

    public Userinfo() {
    }

    public Userinfo(int id, String name, String ped) {
        this.id = id;
        this.name = name;
        this.ped = ped;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPed() {
        return ped;
    }

    public void setPed(String ped) {
        this.ped = ped;
    }

    @Override
    public String toString() {
        return "Userinfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ped='" + ped + '\'' +
                '}';
    }
}
