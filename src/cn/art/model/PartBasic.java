package cn.art.model;

public class PartBasic {
    private Integer pbid;

    private String pbname;

    private Integer tid;

    public Integer getPbid() {
        return pbid;
    }

    public void setPbid(Integer pbid) {
        this.pbid = pbid;
    }

    public String getPbname() {
        return pbname;
    }

    public void setPbname(String pbname) {
        this.pbname = pbname == null ? null : pbname.trim();
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }
}