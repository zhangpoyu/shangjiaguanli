package org.mypro.entity;

public class Dingdan {
    private Integer id;

    private String shangping;

    private Integer shangpingid;

    private String yonghu;

    private Integer yonghuid;

    private String shuliang;

    private String jiage;

    private String zhuangtai;

    private String shijian;

    private String shangjia;

    private Integer shangjiaid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getShuliang() {
        return shuliang;
    }

    public void setShuliang(String shuliang) {
        this.shuliang = shuliang == null ? null : shuliang.trim();
    }

    public String getJiage() {
        return jiage;
    }

    public void setJiage(String jiage) {
        this.jiage = jiage == null ? null : jiage.trim();
    }

    public String getZhuangtai() {
        return zhuangtai;
    }

    public void setZhuangtai(String zhuangtai) {
        this.zhuangtai = zhuangtai == null ? null : zhuangtai.trim();
    }

    public String getShijian() {
        return shijian;
    }

    public void setShijian(String shijian) {
        this.shijian = shijian == null ? null : shijian.trim();
    }

    public String getShangjia() {
        return shangjia;
    }

    public void setShangjia(String shangjia) {
        this.shangjia = shangjia == null ? null : shangjia.trim();
    }

    public Integer getShangjiaid() {
        return shangjiaid;
    }

    public void setShangjiaid(Integer shangjiaid) {
        this.shangjiaid = shangjiaid;
    }
}