package com.renting.entity;

public class TbBill {
    private Integer id;

    private String biticketnum;

    private Integer tenid;

    private String bitate;

    private String updatetime;

    private String aduser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBiticketnum() {
        return biticketnum;
    }

    public void setBiticketnum(String biticketnum) {
        this.biticketnum = biticketnum == null ? null : biticketnum.trim();
    }

    public Integer getTenid() {
        return tenid;
    }

    public void setTenid(Integer tenid) {
        this.tenid = tenid;
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