package cn.ptms.tike.entity;

import java.util.Date;

public class SubOrderForm extends SubOrderFormKey {
    private Integer id;

    private Date bytime;

    private Date classstarttime;

    private Date classendtime;

    private String classinf;

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

    public Date getClassstarttime() {
        return classstarttime;
    }

    public void setClassstarttime(Date classstarttime) {
        this.classstarttime = classstarttime;
    }

    public Date getClassendtime() {
        return classendtime;
    }

    public void setClassendtime(Date classendtime) {
        this.classendtime = classendtime;
    }

    public String getClassinf() {
        return classinf;
    }

    public void setClassinf(String classinf) {
        this.classinf = classinf == null ? null : classinf.trim();
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