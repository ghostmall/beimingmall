package cn.ptms.tike.entity;

public class Users {
    private Integer id;

    private String phone;

    private String nickname;

    private String sex;

    private String realname;

    private Double accbla;

    private String delnum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public Double getAccbla() {
        return accbla;
    }

    public void setAccbla(Double accbla) {
        this.accbla = accbla;
    }

    public String getDelnum() {
        return delnum;
    }

    public void setDelnum(String delnum) {
        this.delnum = delnum == null ? null : delnum.trim();
    }
}