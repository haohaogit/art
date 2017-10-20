package cn.art.util.pojo;

public class colorB {
	private Integer cid;
    private String cbname;
    private String crgb;
    private Integer tid;
    private String cdescription;
    private String cimg;
    
    public String getCrgb() {
        return crgb;
    }

    public void setCrgb(String crgb) {
        this.crgb = crgb == null ? null : crgb.trim();
    }
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCbname() {
		return cbname;
	}
	public void setCbname(String cbname) {
		this.cbname = cbname;
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
		this.cdescription = cdescription;
	}
	public String getCimg() {
		return cimg;
	}
	public void setCimg(String cimg) {
		this.cimg = cimg;
	}
	

}
