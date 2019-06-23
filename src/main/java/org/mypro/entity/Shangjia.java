package org.mypro.entity;

public class Shangjia {
    private Integer id;

    private String mingzi;

    private String username;

    private String password;

    private String shangjiadizhi;

    private String lianxifangshi;

    private String shenhe;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMingzi() {
        return mingzi;
    }

    public void setMingzi(String mingzi) {
        this.mingzi = mingzi == null ? null : mingzi.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getShangjiadizhi() {
        return shangjiadizhi;
    }

    public void setShangjiadizhi(String shangjiadizhi) {
        this.shangjiadizhi = shangjiadizhi == null ? null : shangjiadizhi.trim();
    }

    public String getLianxifangshi() {
        return lianxifangshi;
    }

    public void setLianxifangshi(String lianxifangshi) {
        this.lianxifangshi = lianxifangshi == null ? null : lianxifangshi.trim();
    }

    public String getShenhe() {
        return shenhe;
    }

    public void setShenhe(String shenhe) {
        this.shenhe = shenhe == null ? null : shenhe.trim();
    }
}