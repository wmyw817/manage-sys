package com.renting.entity;

public class WaterElectricityUnit {
    private Integer id;

    private Integer roid;

    private Double waterunit;

    private Double electricityunit;

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

    public Double getWaterunit() {
        return waterunit;
    }

    public void setWaterunit(Double waterunit) {
        this.waterunit = waterunit;
    }

    public Double getElectricityunit() {
        return electricityunit;
    }

    public void setElectricityunit(Double electricityunit) {
        this.electricityunit = electricityunit;
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