package org.mypro.entity;

public class Pingjia {
    private Integer id;

    private String neirong;

    private String pingjia;

    private String yonghu;

    private Integer yonghuid;

    private String shangping;

    private Integer shangpingid;

    private String shanghu;

    private Integer shanghuid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNeirong() {
        return neirong;
    }

    public void setNeirong(String neirong) {
        this.neirong = neirong == null ? null : neirong.trim();
    }

    public String getPingjia() {
        return pingjia;
    }

    public void setPingjia(String pingjia) {
        this.pingjia = pingjia == null ? null : pingjia.trim();
    }

    public String getYonghu() {
        return yonghu;
    }

    public void setYonghu(String yonghu) {
        this.yonghu = yonghu == null ? null : yonghu.trim();
    }

    public Integer getYonghuid() {
        return yonghuid;
    }

    public void setYonghuid(Integer yonghuid) {
        this.yonghuid = yonghuid;
    }

    public String getShangping() {
        return shangping;
    }

    public void setShangping(String shangping) {
        this.shangping = shangping == null ? null : shangping.trim();
    }

    public Integer getShangpingid() {
        return shangpingid;
    }

    public void setShangpingid(Integer shangpingid) {
        this.shangpingid = shangpingid;
    }

    public String getShanghu() {
        return shanghu;
    }

    public void setShanghu(String shanghu) {
        this.shanghu = shanghu == null ? null : shanghu.trim();
    }

    public Integer getShanghuid() {
        return shanghuid;
    }

    public void setShanghuid(Integer shanghuid) {
        this.shanghuid = shanghuid;
    }
}