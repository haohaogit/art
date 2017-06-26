package cn.art.model;

public class Texture {
    private Integer textureid;

    private String tdescription;

    private String timg;

    public Integer getTextureid() {
        return textureid;
    }

    public void setTextureid(Integer textureid) {
        this.textureid = textureid;
    }

    public String getTdescription() {
        return tdescription;
    }

    public void setTdescription(String tdescription) {
        this.tdescription = tdescription == null ? null : tdescription.trim();
    }

    public String getTimg() {
        return timg;
    }

    public void setTimg(String timg) {
        this.timg = timg == null ? null : timg.trim();
    }
}