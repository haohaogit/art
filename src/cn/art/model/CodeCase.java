package cn.art.model;

public class CodeCase {
    private Integer codecaseid;

    private String codecasename;

    private Integer codecasetype;

    private String codecasedata;

    private String codecaseimg;

    public Integer getCodecaseid() {
        return codecaseid;
    }

    public void setCodecaseid(Integer codecaseid) {
        this.codecaseid = codecaseid;
    }

    public String getCodecasename() {
        return codecasename;
    }

    public void setCodecasename(String codecasename) {
        this.codecasename = codecasename == null ? null : codecasename.trim();
    }

    public Integer getCodecasetype() {
        return codecasetype;
    }

    public void setCodecasetype(Integer codecasetype) {
        this.codecasetype = codecasetype;
    }

    public String getCodecasedata() {
        return codecasedata;
    }

    public void setCodecasedata(String codecasedata) {
        this.codecasedata = codecasedata == null ? null : codecasedata.trim();
    }

    public String getCodecaseimg() {
        return codecaseimg;
    }

    public void setCodecaseimg(String codecaseimg) {
        this.codecaseimg = codecaseimg == null ? null : codecaseimg.trim();
    }
}