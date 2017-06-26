package cn.art.model;

public class OutLineType {
    private Integer otid;

    private String oname;

    private Integer tid;

    public Integer getOtid() {
        return otid;
    }

    public void setOtid(Integer otid) {
        this.otid = otid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname == null ? null : oname.trim();
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }
}