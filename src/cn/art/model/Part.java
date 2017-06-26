package cn.art.model;

public class Part {
    private Integer pid;

    private Integer pbid;

    private String pdescription;

    private String pimg;

    private String pfile;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getPbid() {
        return pbid;
    }

    public void setPbid(Integer pbid) {
        this.pbid = pbid;
    }

    public String getPdescription() {
        return pdescription;
    }

    public void setPdescription(String pdescription) {
        this.pdescription = pdescription == null ? null : pdescription.trim();
    }

    public String getPimg() {
        return pimg;
    }

    public void setPimg(String pimg) {
        this.pimg = pimg == null ? null : pimg.trim();
    }

    public String getPfile() {
        return pfile;
    }

    public void setPfile(String pfile) {
        this.pfile = pfile == null ? null : pfile.trim();
    }
}