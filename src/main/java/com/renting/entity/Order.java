package com.renting.entity;

public class Order {
    private Integer id;

    private Integer roid;

    private String ordtotalrentaltime;

    private Double ordtotalrent;

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

    public String getOrdtotalrentaltime() {
        return ordtotalrentaltime;
    }

    public void setOrdtotalrentaltime(String ordtotalrentaltime) {
        this.ordtotalrentaltime = ordtotalrentaltime == null ? null : ordtotalrentaltime.trim();
    }

    public Double getOrdtotalrent() {
        return ordtotalrent;
    }

    public void setOrdtotalrent(Double ordtotalrent) {
        this.ordtotalrent = ordtotalrent;
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