package com.renting.entity;

public class RoomsCheck {
    private Integer id;

    private String ronum;

    private Integer tenid;

    private String rostate;

    private String rocheckin;

    private String rocheckon;

    private Integer ropeoplenum;

    private String updatetime;

    private String aduser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRonum() {
        return ronum;
    }

    public void setRonum(String ronum) {
        this.ronum = ronum == null ? null : ronum.trim();
    }

    public Integer getTenid() {
        return tenid;
    }

    public void setTenid(Integer tenid) {
        this.tenid = tenid;
    }

    public String getRostate() {
        return rostate;
    }

    public void setRostate(String rostate) {
        this.rostate = rostate == null ? null : rostate.trim();
    }

    public String getRocheckin() {
        return rocheckin;
    }

    public void setRocheckin(String rocheckin) {
        this.rocheckin = rocheckin == null ? null : rocheckin.trim();
    }

    public String getRocheckon() {
        return rocheckon;
    }

    public void setRocheckon(String rocheckon) {
        this.rocheckon = rocheckon == null ? null : rocheckon.trim();
    }

    public Integer getRopeoplenum() {
        return ropeoplenum;
    }

    public void setRopeoplenum(Integer ropeoplenum) {
        this.ropeoplenum = ropeoplenum;
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