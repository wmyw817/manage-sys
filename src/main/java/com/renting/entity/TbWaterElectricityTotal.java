package com.renting.entity;

public class TbWaterElectricityTotal {
    private Integer id;

    private Integer roid;

    private Double waterconsumption;

    private Double electricityconsumption;

    private Double waterrate;

    private Double electricityrate;

    private Double usagedays;

    private Double totalcost;

    private String paymenttime;

    private String wetate;

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

    public Double getWaterconsumption() {
        return waterconsumption;
    }

    public void setWaterconsumption(Double waterconsumption) {
        this.waterconsumption = waterconsumption;
    }

    public Double getElectricityconsumption() {
        return electricityconsumption;
    }

    public void setElectricityconsumption(Double electricityconsumption) {
        this.electricityconsumption = electricityconsumption;
    }

    public Double getWaterrate() {
        return waterrate;
    }

    public void setWaterrate(Double waterrate) {
        this.waterrate = waterrate;
    }

    public Double getElectricityrate() {
        return electricityrate;
    }

    public void setElectricityrate(Double electricityrate) {
        this.electricityrate = electricityrate;
    }

    public Double getUsagedays() {
        return usagedays;
    }

    public void setUsagedays(Double usagedays) {
        this.usagedays = usagedays;
    }

    public Double getTotalcost() {
        return totalcost;
    }

    public void setTotalcost(Double totalcost) {
        this.totalcost = totalcost;
    }

    public String getPaymenttime() {
        return paymenttime;
    }

    public void setPaymenttime(String paymenttime) {
        this.paymenttime = paymenttime == null ? null : paymenttime.trim();
    }

    public String getWetate() {
        return wetate;
    }

    public void setWetate(String wetate) {
        this.wetate = wetate == null ? null : wetate.trim();
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