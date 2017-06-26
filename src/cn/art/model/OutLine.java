package cn.art.model;

public class OutLine {
    private Integer oid;

    private String oimg;

    private String ofile;

    private String odescription;

    private String odata;

    private Integer otype;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getOimg() {
        return oimg;
    }

    public void setOimg(String oimg) {
        this.oimg = oimg == null ? null : oimg.trim();
    }

    public String getOfile() {
        return ofile;
    }

    public void setOfile(String ofile) {
        this.ofile = ofile == null ? null : ofile.trim();
    }

    public String getOdescription() {
        return odescription;
    }

    public void setOdescription(String odescription) {
        this.odescription = odescription == null ? null : odescription.trim();
    }

    public String getOdata() {
        return odata;
    }

    public void setOdata(String odata) {
        this.odata = odata == null ? null : odata.trim();
    }

    public Integer getOtype() {
        return otype;
    }

    public void setOtype(Integer otype) {
        this.otype = otype;
    }
}