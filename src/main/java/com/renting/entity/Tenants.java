package com.renting.entity;

public class Tenants {
    private Integer id;

    private String tenuser;

    private String tengender;

    private String tenidcard;

    private String tennation;

    private String tenage;

    private String tenphone;

    private String tenpositive;

    private String tenrent;

    private String tenroomnum;

    private String tencomment;

    private String taxesptn;

    private Integer tenstate;

    private String updatetime;

    private String aduser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenuser() {
        return tenuser;
    }

    public void setTenuser(String tenuser) {
        this.tenuser = tenuser == null ? null : tenuser.trim();
    }

    public String getTengender() {
        return tengender;
    }

    public void setTengender(String tengender) {
        this.tengender = tengender == null ? null : tengender.trim();
    }

    public String getTenidcard() {
        return tenidcard;
    }

    public void setTenidcard(String tenidcard) {
        this.tenidcard = tenidcard == null ? null : tenidcard.trim();
    }

    public String getTennation() {
        return tennation;
    }

    public void setTennation(String tennation) {
        this.tennation = tennation == null ? null : tennation.trim();
    }

    public String getTenage() {
        return tenage;
    }

    public void setTenage(String tenage) {
        this.tenage = tenage == null ? null : tenage.trim();
    }

    public String getTenphone() {
        return tenphone;
    }

    public void setTenphone(String tenphone) {
        this.tenphone = tenphone == null ? null : tenphone.trim();
    }

    public String getTenpositive() {
        return tenpositive;
    }

    public void setTenpositive(String tenpositive) {
        this.tenpositive = tenpositive == null ? null : tenpositive.trim();
    }

    public String getTenrent() {
        return tenrent;
    }

    public void setTenrent(String tenrent) {
        this.tenrent = tenrent == null ? null : tenrent.trim();
    }

    public String getTenroomnum() {
        return tenroomnum;
    }

    public void setTenroomnum(String tenroomnum) {
        this.tenroomnum = tenroomnum == null ? null : tenroomnum.trim();
    }

    public String getTencomment() {
        return tencomment;
    }

    public void setTencomment(String tencomment) {
        this.tencomment = tencomment == null ? null : tencomment.trim();
    }

    public String getTaxesptn() {
        return taxesptn;
    }

    public void setTaxesptn(String taxesptn) {
        this.taxesptn = taxesptn == null ? null : taxesptn.trim();
    }

    public Integer getTenstate() {
        return tenstate;
    }

    public void setTenstate(Integer tenstate) {
        this.tenstate = tenstate;
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