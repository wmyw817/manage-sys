package com.renting.entity;

public class TbTaxesPattern {
    private Integer id;

    private Integer taxesptn;

    private String taxescomment;

    private String updatetime;

    private String aduser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaxesptn() {
        return taxesptn;
    }

    public void setTaxesptn(Integer taxesptn) {
        this.taxesptn = taxesptn;
    }

    public String getTaxescomment() {
        return taxescomment;
    }

    public void setTaxescomment(String taxescomment) {
        this.taxescomment = taxescomment == null ? null : taxescomment.trim();
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