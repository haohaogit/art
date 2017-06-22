package cn.art.model;

public class Shape {
    private Integer shapeid;

    private String shapeimg;

    private String shapefile;

    private String shapedescription;

    private String shapedata;

    public Integer getShapeid() {
        return shapeid;
    }

    public void setShapeid(Integer shapeid) {
        this.shapeid = shapeid;
    }

    public String getShapeimg() {
        return shapeimg;
    }

    public void setShapeimg(String shapeimg) {
        this.shapeimg = shapeimg == null ? null : shapeimg.trim();
    }

    public String getShapefile() {
        return shapefile;
    }

    public void setShapefile(String shapefile) {
        this.shapefile = shapefile == null ? null : shapefile.trim();
    }

    public String getShapedescription() {
        return shapedescription;
    }

    public void setShapedescription(String shapedescription) {
        this.shapedescription = shapedescription == null ? null : shapedescription.trim();
    }

    public String getShapedata() {
        return shapedata;
    }

    public void setShapedata(String shapedata) {
        this.shapedata = shapedata == null ? null : shapedata.trim();
    }
}