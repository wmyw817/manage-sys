package com.renting.entity;

public class TbAdmin {
    private Integer id;

    private String aduser;

    private String adpwd;

    private String adphone;

    private String updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAduser() {
        return aduser;
    }

    public void setAduser(String aduser) {
        this.aduser = aduser == null ? null : aduser.trim();
    }

    public String getAdpwd() {
        return adpwd;
    }

    public void setAdpwd(String adpwd) {
        this.adpwd = adpwd == null ? null : adpwd.trim();
    }

    public String getAdphone() {
        return adphone;
    }

    public void setAdphone(String adphone) {
        this.adphone = adphone == null ? null : adphone.trim();
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime == null ? null : updatetime.trim();
    }
}