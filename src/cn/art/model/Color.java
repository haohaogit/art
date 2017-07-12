package cn.art.model;

public class Color {
    private Integer cid;

    private Integer cbid;

    private Integer tid;

    private String cdescription;

    private String crgb;

    private String cnum;

    private String cfile;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getCbid() {
        return cbid;
    }

    public void setCbid(Integer cbid) {
        this.cbid = cbid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getCdescription() {
        return cdescription;
    }

    public void setCdescription(String cdescription) {
        this.cdescription = cdescription == null ? null : cdescription.trim();
    }

    public String getCrgb() {
        return crgb;
    }

    public void setCrgb(String crgb) {
        this.crgb = crgb == null ? null : crgb.trim();
    }

    public String getCnum() {
        return cnum;
    }

    public void setCnum(String cnum) {
        this.cnum = cnum == null ? null : cnum.trim();
    }

    public String getCfile() {
        return cfile;
    }

    public void setCfile(String cfile) {
        this.cfile = cfile == null ? null : cfile.trim();
    }
}