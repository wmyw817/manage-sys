package com.renting.entity;

public class Chummage {
    private Integer id;

    private Integer roid;

    private Double chrent;

    private String chpaymenttime;

    private String chnextpaymenttime;

    private String chtate;

    private String updatetime;

    private String aduser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoid() {
        return roid;
    }

    public void setRoid(Integer roid) {
        this.roid = roid;
    }

    public Double getChrent() {
        return chrent;
    }

    public void setChrent(Double chrent) {
        this.chrent = chrent;
    }

    public String getChpaymenttime() {
        return chpaymenttime;
    }

    public void setChpaymenttime(String chpaymenttime) {
        this.chpaymenttime = chpaymenttime == null ? null : chpaymenttime.trim();
    }

    public String getChnextpaymenttime() {
        return chnextpaymenttime;
    }

    public void setChnextpaymenttime(String chnextpaymenttime) {
        this.chnextpaymenttime = chnextpaymenttime == null ? null : chnextpaymenttime.trim();
    }

    public String getChtate() {
        return chtate;
    }

    public void setChtate(String chtate) {
        this.chtate = chtate == null ? null : chtate.trim();
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime == null ? null : updatetime.trim();
    }

    public String getAduser() {
        return aduser;
    }

    public void setAduser(String aduser) {
        this.aduser = aduser == null ? null : aduser.trim();
    }
}