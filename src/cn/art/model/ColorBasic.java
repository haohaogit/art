package cn.art.model;

public class ColorBasic {
    private Integer cbid;

    private String cbname;

    private Integer tid;

    public Integer getCbid() {
        return cbid;
    }

    public void setCbid(Integer cbid) {
        this.cbid = cbid;
    }

    public String getCbname() {
        return cbname;
    }

    public void setCbname(String cbname) {
        this.cbname = cbname == null ? null : cbname.trim();
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }
}