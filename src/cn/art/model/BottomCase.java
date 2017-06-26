package cn.art.model;

public class BottomCase {
    private Integer caseid;

    private String casename;

    private String casebrand;

    private Integer stid;

    private Integer pbid;

    private Integer cbid;

    private Integer textureid;

    private String caseimg;

    public Integer getCaseid() {
        return caseid;
    }

    public void setCaseid(Integer caseid) {
        this.caseid = caseid;
    }

    public String getCasename() {
        return casename;
    }

    public void setCasename(String casename) {
        this.casename = casename == null ? null : casename.trim();
    }

    public String getCasebrand() {
        return casebrand;
    }

    public void setCasebrand(String casebrand) {
        this.casebrand = casebrand == null ? null : casebrand.trim();
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public Integer getPbid() {
        return pbid;
    }

    public void setPbid(Integer pbid) {
        this.pbid = pbid;
    }

    public Integer getCbid() {
        return cbid;
    }

    public void setCbid(Integer cbid) {
        this.cbid = cbid;
    }

    public Integer getTextureid() {
        return textureid;
    }

    public void setTextureid(Integer textureid) {
        this.textureid = textureid;
    }

    public String getCaseimg() {
        return caseimg;
    }

    public void setCaseimg(String caseimg) {
        this.caseimg = caseimg == null ? null : caseimg.trim();
    }
}