package com.renting.entity;

public class TbDeposit {
    private Integer id;

    private Integer roid;

    private String biticketnum;

    private String bicashpledges;

    private String bipaymenttime;

    private String bicashpledge;

    private String bitate;

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

    public String getBiticketnum() {
        return biticketnum;
    }

    public void setBiticketnum(String biticketnum) {
        this.biticketnum = biticketnum == null ? null : biticketnum.trim();
    }

    public String getBicashpledges() {
        return bicashpledges;
    }

    public void setBicashpledges(String bicashpledges) {
        this.bicashpledges = bicashpledges == null ? null : bicashpledges.trim();
    }

    public String getBipaymenttime() {
        return bipaymenttime;
    }

    public void setBipaymenttime(String bipaymenttime) {
        this.bipaymenttime = bipaymenttime == null ? null : bipaymenttime.trim();
    }

    public String getBicashpledge() {
        return bicashpledge;
    }

    public void setBicashpledge(String bicashpledge) {
        this.bicashpledge = bicashpledge == null ? null : bicashpledge.trim();
    }

    public String getBitate() {
        return bitate;
    }

    public void setBitate(String bitate) {
        this.bitate = bitate == null ? null : bitate.trim();
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