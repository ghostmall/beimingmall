package cn.ptms.tike.entity;

import java.util.Date;

public class SecInfoSheet extends SecInfoSheetKey {
    private Integer id;

    private Date bytime;

    private String name;

    private String piclink;

    private Double asbts;

    private Double payee;

    private Double platextr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBytime() {
        return bytime;
    }

    public void setBytime(Date bytime) {
        this.bytime = bytime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPiclink() {
        return piclink;
    }

    public void setPiclink(String piclink) {
        this.piclink = piclink == null ? null : piclink.trim();
    }

    public Double getAsbts() {
        return asbts;
    }

    public void setAsbts(Double asbts) {
        this.asbts = asbts;
    }

    public Double getPayee() {
        return payee;
    }

    public void setPayee(Double payee) {
        this.payee = payee;
    }

    public Double getPlatextr() {
        return platextr;
    }

    public void setPlatextr(Double platextr) {
        this.platextr = platextr;
    }
}