package cn.ptms.tike.entity;

import java.util.Date;

public class RunOrderForm extends RunOrderFormKey {
    private Integer id;

    private Date bytime;

    private Date endtime;

    private Date lasttime;

    private String startloc;

    private String deliverloc;

    private Double asbts;

    private Double payee;

    private Double plaamo;

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

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }

    public String getStartloc() {
        return startloc;
    }

    public void setStartloc(String startloc) {
        this.startloc = startloc == null ? null : startloc.trim();
    }

    public String getDeliverloc() {
        return deliverloc;
    }

    public void setDeliverloc(String deliverloc) {
        this.deliverloc = deliverloc == null ? null : deliverloc.trim();
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

    public Double getPlaamo() {
        return plaamo;
    }

    public void setPlaamo(Double plaamo) {
        this.plaamo = plaamo;
    }
}