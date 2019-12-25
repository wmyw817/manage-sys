package com.renting.entity;

public class WaterElectricityUse {
    private Integer id;

    private Integer roid;

    private Integer tenid;

    private Double waternum;

    private Double electricitynum;

    private String rocheckin;

    private String meterreading;

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

    public Integer getTenid() {
        return tenid;
    }

    public void setTenid(Integer tenid) {
        this.tenid = tenid;
    }

    public Double getWaternum() {
        return waternum;
    }

    public void setWaternum(Double waternum) {
        this.waternum = waternum;
    }

    public Double getElectricitynum() {
        return electricitynum;
    }

    public void setElectricitynum(Double electricitynum) {
        this.electricitynum = electricitynum;
    }

    public String getRocheckin() {
        return rocheckin;
    }

    public void setRocheckin(String rocheckin) {
        this.rocheckin = rocheckin == null ? null : rocheckin.trim();
    }

    public String getMeterreading() {
        return meterreading;
    }

    public void setMeterreading(String meterreading) {
        this.meterreading = meterreading == null ? null : meterreading.trim();
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