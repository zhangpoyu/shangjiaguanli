package org.mypro.entity;

public class Yonghu {
    private Integer id;

    private String mingzi;

    private String username;

    private String password;

    private String xingbie;

    private String nianling;

    private String shouhuodizhi;

    private String lianxifangshi;

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

    public String getXingbie() {
        return xingbie;
    }

    public void setXingbie(String xingbie) {
        this.xingbie = xingbie == null ? null : xingbie.trim();
    }

    public String getNianling() {
        return nianling;
    }

    public void setNianling(String nianling) {
        this.nianling = nianling == null ? null : nianling.trim();
    }

    public String getShouhuodizhi() {
        return shouhuodizhi;
    }

    public void setShouhuodizhi(String shouhuodizhi) {
        this.shouhuodizhi = shouhuodizhi == null ? null : shouhuodizhi.trim();
    }

    public String getLianxifangshi() {
        return lianxifangshi;
    }

    public void setLianxifangshi(String lianxifangshi) {
        this.lianxifangshi = lianxifangshi == null ? null : lianxifangshi.trim();
    }
}