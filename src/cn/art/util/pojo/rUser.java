package cn.art.util.pojo;

public class rUser {

	    private String uname;
	    private String upassword;
	    private String cpassword;
	    private String uemail;

	    public String getUname() {
	        return uname;
	    }

	    public void setUname(String uname) {
	        this.uname = uname == null ? null : uname.trim();
	    }

	    public String getUpassword() {
	        return upassword;
	    }

	    public void setUpassword(String upassword) {
	        this.upassword = upassword == null ? null : upassword.trim();
	    }
	    public String getCpassword() {
	        return cpassword;
	    }

	    public void setCpassword(String cpassword) {
	        this.cpassword = cpassword == null ? null : cpassword.trim();
	    }

	    public String getUemail() {
	        return uemail;
	    }

	    public void setUemail(String uemail) {
	        this.uemail = uemail == null ? null : uemail.trim();
	    }

}
